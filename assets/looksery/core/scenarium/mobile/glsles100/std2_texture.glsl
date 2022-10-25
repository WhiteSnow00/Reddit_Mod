#pragma once
#if defined VERTEX_SHADER
    #ifndef sc_TextureRenderingLayout_Regular
        #define sc_TextureRenderingLayout_Regular 0
        #define sc_TextureRenderingLayout_StereoInstancedClipped 1
        #define sc_TextureRenderingLayout_StereoMultiview 2
    #endif

#include <std2_stereo_view_index.glsl>
#include <std2_texture_sub.glsl>



vec4 sc_textureLodLegacy(highp sampler2D tex, vec2 texSize, vec2 uv, float lod)
{
    #if sc_CanUseTextureLod == 1
        return texture2DLod(tex, uv, lod);
    #elif sc_CanUseStandardDerivatives == 1 // #if sc_CanUseTextureLod == 1
        vec2 texels = uv * texSize;
        float dudx = dFdx(texels.x);
        float dvdx = dFdx(texels.y);
        float dudy = dFdy(texels.x);
        float dvdy = dFdy(texels.y);
        float rho = max(length(vec2(dudx, dvdx)), length(vec2(dudy, dvdy))); // OpenGL reference calculation
        float mu = max(abs(dudx), abs(dudy));
        float mv = max(abs(dvdx), abs(dvdy));
        float rho2 = max(mu, mv); // The allowed alternative OpenGL reference calculation that seems to match the main reference best.
        float mip = log2(rho2);
        float bias = lod - mip;
        return texture2D(tex, uv, bias);
    #elif defined(FRAGMENT_SHADER) // #elif sc_CanUseStandardDerivatives == 1 // #if sc_CanUseTextureLod == 1
        return texture2D(tex, uv, lod);
    #else // #elif defined(FRAGMENT_SHADER) // #elif sc_CanUseStandardDerivatives == 1 // #if sc_CanUseTextureLod == 1
        return vec4(0.0);
    #endif // #else // #elif defined(FRAGMENT_SHADER) // #elif sc_CanUseStandardDerivatives == 1 // #if sc_CanUseTextureLod == 1

}

vec4 sc_textureLodLegacyArr(highp sampler2DArray tex, vec2 texSize, vec3 uv, float lod)
{
    #if sc_CanUseSampler2DArray == 1
        return texture2DLod(tex, uv, lod);
    #else // #if sc_CanUseSampler2DArray == 1
        return vec4(0.0);
    #endif // #else // #if sc_CanUseSampler2DArray == 1

}

vec4 sc_textureLod(highp sampler2D tex, vec2 texSize, vec2 uv, float lod)
{
    vec2 param = texSize;
    vec2 param_1 = uv;
    float param_2 = lod;
    return sc_textureLodLegacy(tex, param, param_1, param_2);
}

vec4 sc_textureLod(highp sampler2DArray tex, vec2 texSize, vec3 uv, float lod)
{
    vec2 param = texSize;
    vec3 param_1 = uv;
    float param_2 = lod;
    return sc_textureLodLegacyArr(tex, param, param_1, param_2);
}

vec4 sc_textureBiasOrLod(highp sampler2D tex, vec2 texSize, vec2 uv, float biasOrLod)
{
    vec2 param = texSize;
    vec2 param_1 = uv;
    float param_2 = biasOrLod;
    return sc_textureLod(tex, param, param_1, param_2);
}

vec4 sc_textureBiasOrLod(highp sampler2DArray tex, vec2 texSize, vec3 uv, float biasOrLod)
{
    vec2 param = texSize;
    vec3 param_1 = uv;
    float param_2 = biasOrLod;
    return sc_textureLod(tex, param, param_1, param_2);
}

vec4 sc_textureLod(highp sampler2D tex, vec2 uv, float lod)
{
#if (__VERSION__ >= 300)
    return textureLod(tex, uv, lod);
#elif defined(FRAGMENT_SHADER)
    #if sc_CanUseTextureLod
        return texture2DLod(tex, uv, lod);
    #else
        return texture2D(tex, uv, lod);
    #endif
#elif defined(VERTEX_SHADER)
    #if sc_MaxVertexTextureImageUnits > 0
        return texture2DLod(tex, uv, lod);
    #else
        return vec4(0.0);
    #endif
#endif

}

vec4 sc_textureLod(highp sampler2DArray tex, vec3 uv, float lod)
{
#if (__VERSION__ >= 300)
    return textureLod(tex, uv, lod);
#elif (__VERSION__ == 120)
    return texture2DArrayLod(tex, uv, lod);
#else
    return vec4(0.0);
#endif

}

vec4 sc_textureLod(highp sampler3D tex, vec3 uv, float lod)
{
#if (__VERSION__ >= 300)
    return textureLod(tex, uv, lod);
#elif (__VERSION__ == 120)
    return texture3DLod(tex, uv, lod);
#else
    return vec4(0.0);
#endif

}

vec4 sc_textureLod(highp samplerCube tex, vec3 uv, float lod)
{
#if __VERSION__ >= 300
    return textureLod(tex, uv, lod);
#elif __VERSION__ == 100
    return vec4(0.0); // [LOOK-116977] Not all ES2 platforms support textureCubeLod(), notably WebGL 1 on Safari, so we just turn it off on all ES2. The user base is small enough to not matter.
#elif defined(FRAGMENT_SHADER)
    #if sc_CanUseTextureLod
        return textureCubeLod(tex, uv, lod);
    #else
        return textureCube(tex, uv, lod);
    #endif
#elif defined(VERTEX_SHADER)
    #if sc_MaxVertexTextureImageUnits > 0
        return textureCubeLod(tex, uv, lod);
    #else
        return vec4(0.0);
    #endif
#endif

}

vec2 sc_SamplingCoordsGlobalToView(inout vec3 uvi, int renderingLayout, int viewIndex)
{
    if (renderingLayout == 1)
    {
        uvi.y = ((2.0 * uvi.y) + float(viewIndex)) - 1.0;
    }
    return uvi.xy;
}

vec2 sc_ScreenCoordsGlobalToView(vec2 uv)
{
    #if (sc_StereoRenderingMode==1)
    {
        vec3 uvi = vec3(uv, 0.0);
        int instancedClippedLayout = 1;
        int viewIndex = sc_GetStereoViewIndex();
        vec3 param = vec3(uv, 0.0);
        int param_1 = instancedClippedLayout;
        int param_2 = viewIndex;
        vec2 _287 = sc_SamplingCoordsGlobalToView(param, param_1, param_2);
        return _287;
    }
    #else // #if (sc_StereoRenderingMode==1)
    {
        return uv;
    }
    #endif // #else // #if (sc_StereoRenderingMode==1)
}

vec3 sc_SamplingCoordsViewToGlobal(vec2 uv, int renderingLayout, int viewIndex)
{
    if (renderingLayout == 0)
    {
        return vec3(uv, 0.0);
    }
    else
    {
        if (renderingLayout == 1)
        {
            return vec3(uv.x, (uv.y * 0.5) + (0.5 - (float(viewIndex) * 0.5)), 0.0);
        }
        else
        {
            return vec3(uv, float(viewIndex));
        }
    }
}

vec4 sc_SampleViewLevel(highp sampler2D tex, vec2 texSize, vec2 uv, int renderingLayout, int viewIndex, float level)
{
    vec2 param = uv;
    int param_1 = renderingLayout;
    int param_2 = viewIndex;
    vec3 uvi = sc_SamplingCoordsViewToGlobal(param, param_1, param_2);
    vec2 param_3 = texSize;
    vec2 param_4 = uvi.xy;
    float param_5 = level;
    return sc_textureLod(tex, param_3, param_4, param_5);
}

vec4 sc_SampleView(highp sampler2D tex, vec2 texSize, vec2 uv, int renderingLayout, int viewIndex, float bias)
{
    vec2 param = texSize;
    vec2 param_1 = uv;
    int param_2 = renderingLayout;
    int param_3 = viewIndex;
    float param_4 = bias;
    return sc_SampleViewLevel(tex, param, param_1, param_2, param_3, param_4);
}

vec4 sc_SampleView(highp sampler2D tex, vec2 texSize, vec2 uv, int renderingLayout, int viewIndex)
{
    vec2 param = texSize;
    vec2 param_1 = uv;
    int param_2 = renderingLayout;
    int param_3 = viewIndex;
    float param_4 = 0.0;
    return sc_SampleView(tex, param, param_1, param_2, param_3, param_4);
}

vec4 sc_SampleViewLevel(highp sampler2DArray tex, vec2 texSize, vec2 uv, int renderingLayout, int viewIndex, float level)
{
    vec2 param = uv;
    int param_1 = renderingLayout;
    int param_2 = viewIndex;
    vec3 uvi = sc_SamplingCoordsViewToGlobal(param, param_1, param_2);
    vec2 param_3 = texSize;
    vec3 param_4 = uvi;
    float param_5 = level;
    return sc_textureLod(tex, param_3, param_4, param_5);
}

vec4 sc_SampleView(highp sampler2DArray tex, vec2 texSize, vec2 uv, int renderingLayout, int viewIndex, float bias)
{
    vec2 param = uv;
    int param_1 = renderingLayout;
    int param_2 = viewIndex;
    vec3 uvi = sc_SamplingCoordsViewToGlobal(param, param_1, param_2);
    vec2 param_3 = texSize;
    vec3 param_4 = uvi;
    float param_5 = bias;
    return sc_textureBiasOrLod(tex, param_3, param_4, param_5);
}

vec4 sc_SampleView(highp sampler2DArray tex, vec2 texSize, vec2 uv, int renderingLayout, int viewIndex)
{
    vec2 param = texSize;
    vec2 param_1 = uv;
    int param_2 = renderingLayout;
    int param_3 = viewIndex;
    float param_4 = 0.0;
    return sc_SampleView(tex, param, param_1, param_2, param_3, param_4);
}

vec2 quantizeUV(vec2 uv)
{
    return uv;
}

vec4 sampleTextureWithTransform(highp sampler2DArray sampler, inout vec3 uv, bool useLOD, float lod, bool useUvTransform, mat3 uvTransform)
{
    if (useUvTransform)
    {
        vec2 _434 = vec2((uvTransform * vec3(uv.xy, 1.0)).xy);
        uv = vec3(_434.x, _434.y, uv.z);
    }
    vec2 param = uv.xy;
    vec2 _440 = quantizeUV(param);
    uv = vec3(_440.x, _440.y, uv.z);
    if (useLOD)
    {
        vec3 param_1 = uv;
        float param_2 = lod;
        return sc_textureLod(sampler, param_1, param_2);
    }
    else
    {
        return texture2D(sampler, uv);
    }
}

float depthToGlobal(inout float depth, vec2 projectionMatrixTerms)
{
    float m22 = projectionMatrixTerms.x;
    float m32 = projectionMatrixTerms.y;
    depth = (depth * 2.0) - 1.0;
    return m32 / ((-depth) - m22);
}

float depthToLocal(inout float depth, vec2 projectionMatrixTerms)
{
    float m22 = projectionMatrixTerms.x;
    float m32 = projectionMatrixTerms.y;
    float _483;
    if (depth != 0.0)
    {
        _483 = (-m22) - (m32 / depth);
    }
    else
    {
        _483 = 0.0;
    }
    depth = _483;
    return (depth * 0.5) + 0.5;
}

vec4 sampleTextureWithTransform(highp sampler2D sampler, inout vec2 uv, bool useUvTransform, mat3 uvTransform)
{
    if (useUvTransform)
    {
        uv = vec2((uvTransform * vec3(uv, 1.0)).xy);
    }
    vec2 param = uv;
    uv = quantizeUV(param);
    return texture2D(sampler, uv);
}

#elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
    #ifndef sc_TextureRenderingLayout_Regular
        #define sc_TextureRenderingLayout_Regular 0
        #define sc_TextureRenderingLayout_StereoInstancedClipped 1
        #define sc_TextureRenderingLayout_StereoMultiview 2
    #endif

#include <std2_stereo_view_index.glsl>
#include <std2_texture_sub.glsl>



highp vec4 sc_textureLodLegacy(highp sampler2D tex, highp vec2 texSize, highp vec2 uv, highp float lod)
{
    #if sc_CanUseTextureLod == 1
        return texture2DLod(tex, uv, lod);
    #elif sc_CanUseStandardDerivatives == 1 // #if sc_CanUseTextureLod == 1
        vec2 texels = uv * texSize;
        float dudx = dFdx(texels.x);
        float dvdx = dFdx(texels.y);
        float dudy = dFdy(texels.x);
        float dvdy = dFdy(texels.y);
        float rho = max(length(vec2(dudx, dvdx)), length(vec2(dudy, dvdy))); // OpenGL reference calculation
        float mu = max(abs(dudx), abs(dudy));
        float mv = max(abs(dvdx), abs(dvdy));
        float rho2 = max(mu, mv); // The allowed alternative OpenGL reference calculation that seems to match the main reference best.
        float mip = log2(rho2);
        float bias = lod - mip;
        return texture2D(tex, uv, bias);
    #elif defined(FRAGMENT_SHADER) // #elif sc_CanUseStandardDerivatives == 1 // #if sc_CanUseTextureLod == 1
        return texture2D(tex, uv, lod);
    #else // #elif defined(FRAGMENT_SHADER) // #elif sc_CanUseStandardDerivatives == 1 // #if sc_CanUseTextureLod == 1
        return vec4(0.0);
    #endif // #else // #elif defined(FRAGMENT_SHADER) // #elif sc_CanUseStandardDerivatives == 1 // #if sc_CanUseTextureLod == 1

}

highp vec4 sc_textureLodLegacyArr(highp sampler2DArray tex, highp vec2 texSize, highp vec3 uv, highp float lod)
{
    #if sc_CanUseSampler2DArray == 1
        return texture2DLod(tex, uv, lod);
    #else // #if sc_CanUseSampler2DArray == 1
        return vec4(0.0);
    #endif // #else // #if sc_CanUseSampler2DArray == 1

}

highp vec4 sc_textureLod(highp sampler2D tex, highp vec2 texSize, highp vec2 uv, highp float lod)
{
    highp vec2 param = texSize;
    highp vec2 param_1 = uv;
    highp float param_2 = lod;
    return sc_textureLodLegacy(tex, param, param_1, param_2);
}

highp vec4 sc_textureLod(highp sampler2DArray tex, highp vec2 texSize, highp vec3 uv, highp float lod)
{
    highp vec2 param = texSize;
    highp vec3 param_1 = uv;
    highp float param_2 = lod;
    return sc_textureLodLegacyArr(tex, param, param_1, param_2);
}

highp vec4 sc_textureBiasOrLod(highp sampler2D tex, highp vec2 texSize, highp vec2 uv, highp float biasOrLod)
{
    return texture2D(tex, uv, biasOrLod);
}

highp vec4 sc_textureBiasOrLod(highp sampler2DArray tex, highp vec2 texSize, highp vec3 uv, highp float biasOrLod)
{
    highp vec2 param = texSize;
    highp vec3 param_1 = uv;
    highp float param_2 = biasOrLod;
    return sc_textureLod(tex, param, param_1, param_2);
}

highp vec4 sc_textureLod(highp sampler2D tex, highp vec2 uv, highp float lod)
{
#if (__VERSION__ >= 300)
    return textureLod(tex, uv, lod);
#elif defined(FRAGMENT_SHADER)
    #if sc_CanUseTextureLod
        return texture2DLod(tex, uv, lod);
    #else
        return texture2D(tex, uv, lod);
    #endif
#elif defined(VERTEX_SHADER)
    #if sc_MaxVertexTextureImageUnits > 0
        return texture2DLod(tex, uv, lod);
    #else
        return vec4(0.0);
    #endif
#endif

}

highp vec4 sc_textureLod(highp sampler2DArray tex, highp vec3 uv, highp float lod)
{
#if (__VERSION__ >= 300)
    return textureLod(tex, uv, lod);
#elif (__VERSION__ == 120)
    return texture2DArrayLod(tex, uv, lod);
#else
    return vec4(0.0);
#endif

}

highp vec4 sc_textureLod(highp sampler3D tex, highp vec3 uv, highp float lod)
{
#if (__VERSION__ >= 300)
    return textureLod(tex, uv, lod);
#elif (__VERSION__ == 120)
    return texture3DLod(tex, uv, lod);
#else
    return vec4(0.0);
#endif

}

highp vec4 sc_textureLod(highp samplerCube tex, highp vec3 uv, highp float lod)
{
#if __VERSION__ >= 300
    return textureLod(tex, uv, lod);
#elif __VERSION__ == 100
    return vec4(0.0); // [LOOK-116977] Not all ES2 platforms support textureCubeLod(), notably WebGL 1 on Safari, so we just turn it off on all ES2. The user base is small enough to not matter.
#elif defined(FRAGMENT_SHADER)
    #if sc_CanUseTextureLod
        return textureCubeLod(tex, uv, lod);
    #else
        return textureCube(tex, uv, lod);
    #endif
#elif defined(VERTEX_SHADER)
    #if sc_MaxVertexTextureImageUnits > 0
        return textureCubeLod(tex, uv, lod);
    #else
        return vec4(0.0);
    #endif
#endif

}

highp vec2 sc_SamplingCoordsGlobalToView(inout highp vec3 uvi, int renderingLayout, int viewIndex)
{
    if (renderingLayout == 1)
    {
        uvi.y = ((2.0 * uvi.y) + float(viewIndex)) - 1.0;
    }
    return uvi.xy;
}

highp vec2 sc_ScreenCoordsGlobalToView(highp vec2 uv)
{
    #if (sc_StereoRenderingMode==1)
    {
        highp vec3 uvi = vec3(uv, 0.0);
        int instancedClippedLayout = 1;
        int viewIndex = sc_GetStereoViewIndex();
        highp vec3 param = vec3(uv, 0.0);
        int param_1 = instancedClippedLayout;
        int param_2 = viewIndex;
        highp vec2 _371 = sc_SamplingCoordsGlobalToView(param, param_1, param_2);
        return _371;
    }
    #else // #if (sc_StereoRenderingMode==1)
    {
        return uv;
    }
    #endif // #else // #if (sc_StereoRenderingMode==1)
}

highp vec3 sc_SamplingCoordsViewToGlobal(highp vec2 uv, int renderingLayout, int viewIndex)
{
    if (renderingLayout == 0)
    {
        return vec3(uv, 0.0);
    }
    else
    {
        if (renderingLayout == 1)
        {
            return vec3(uv.x, (uv.y * 0.5) + (0.5 - (float(viewIndex) * 0.5)), 0.0);
        }
        else
        {
            return vec3(uv, float(viewIndex));
        }
    }
}

highp vec4 sc_SampleViewLevel(highp sampler2D tex, highp vec2 texSize, highp vec2 uv, int renderingLayout, int viewIndex, highp float level)
{
    highp vec2 param = uv;
    int param_1 = renderingLayout;
    int param_2 = viewIndex;
    highp vec3 uvi = sc_SamplingCoordsViewToGlobal(param, param_1, param_2);
    highp vec2 param_3 = texSize;
    highp vec2 param_4 = uvi.xy;
    highp float param_5 = level;
    return sc_textureLod(tex, param_3, param_4, param_5);
}

highp vec4 sc_SampleView(highp sampler2D tex, highp vec2 texSize, highp vec2 uv, int renderingLayout, int viewIndex, highp float bias)
{
    highp vec2 param = uv;
    int param_1 = renderingLayout;
    int param_2 = viewIndex;
    highp vec3 uvi = sc_SamplingCoordsViewToGlobal(param, param_1, param_2);
    highp vec2 param_3 = texSize;
    highp vec2 param_4 = uvi.xy;
    highp float param_5 = bias;
    return sc_textureBiasOrLod(tex, param_3, param_4, param_5);
}

highp vec4 sc_SampleView(highp sampler2D tex, highp vec2 texSize, highp vec2 uv, int renderingLayout, int viewIndex)
{
    highp vec2 param = texSize;
    highp vec2 param_1 = uv;
    int param_2 = renderingLayout;
    int param_3 = viewIndex;
    highp float param_4 = 0.0;
    return sc_SampleView(tex, param, param_1, param_2, param_3, param_4);
}

highp vec4 sc_SampleViewLevel(highp sampler2DArray tex, highp vec2 texSize, highp vec2 uv, int renderingLayout, int viewIndex, highp float level)
{
    highp vec2 param = uv;
    int param_1 = renderingLayout;
    int param_2 = viewIndex;
    highp vec3 uvi = sc_SamplingCoordsViewToGlobal(param, param_1, param_2);
    highp vec2 param_3 = texSize;
    highp vec3 param_4 = uvi;
    highp float param_5 = level;
    return sc_textureLod(tex, param_3, param_4, param_5);
}

highp vec4 sc_SampleView(highp sampler2DArray tex, highp vec2 texSize, highp vec2 uv, int renderingLayout, int viewIndex, highp float bias)
{
    highp vec2 param = uv;
    int param_1 = renderingLayout;
    int param_2 = viewIndex;
    highp vec3 uvi = sc_SamplingCoordsViewToGlobal(param, param_1, param_2);
    highp vec2 param_3 = texSize;
    highp vec3 param_4 = uvi;
    highp float param_5 = bias;
    return sc_textureBiasOrLod(tex, param_3, param_4, param_5);
}

highp vec4 sc_SampleView(highp sampler2DArray tex, highp vec2 texSize, highp vec2 uv, int renderingLayout, int viewIndex)
{
    highp vec2 param = texSize;
    highp vec2 param_1 = uv;
    int param_2 = renderingLayout;
    int param_3 = viewIndex;
    highp float param_4 = 0.0;
    return sc_SampleView(tex, param, param_1, param_2, param_3, param_4);
}

highp vec2 quantizeUV(highp vec2 uv)
{
    return uv;
}

highp vec4 sampleTextureWithTransform(highp sampler2DArray sampler, inout highp vec3 uv, bool useLOD, highp float lod, bool useUvTransform, highp mat3 uvTransform)
{
    if (useUvTransform)
    {
        highp vec2 _522 = vec2((uvTransform * vec3(uv.xy, 1.0)).xy);
        uv = vec3(_522.x, _522.y, uv.z);
    }
    highp vec2 param = uv.xy;
    highp vec2 _528 = quantizeUV(param);
    uv = vec3(_528.x, _528.y, uv.z);
    if (useLOD)
    {
        highp vec3 param_1 = uv;
        highp float param_2 = lod;
        return sc_textureLod(sampler, param_1, param_2);
    }
    else
    {
        return texture2D(sampler, uv);
    }
}

highp float depthToGlobal(inout highp float depth, highp vec2 projectionMatrixTerms)
{
    highp float m22 = projectionMatrixTerms.x;
    highp float m32 = projectionMatrixTerms.y;
    depth = (depth * 2.0) - 1.0;
    return m32 / ((-depth) - m22);
}

highp float depthToLocal(inout highp float depth, highp vec2 projectionMatrixTerms)
{
    highp float m22 = projectionMatrixTerms.x;
    highp float m32 = projectionMatrixTerms.y;
    highp float _571;
    if (depth != 0.0)
    {
        _571 = (-m22) - (m32 / depth);
    }
    else
    {
        _571 = 0.0;
    }
    depth = _571;
    return (depth * 0.5) + 0.5;
}

highp vec4 sampleTextureWithTransform(highp sampler2D sampler, inout highp vec2 uv, bool useUvTransform, highp mat3 uvTransform)
{
    if (useUvTransform)
    {
        uv = vec2((uvTransform * vec3(uv, 1.0)).xy);
    }
    highp vec2 param = uv;
    uv = quantizeUV(param);
    return texture2D(sampler, uv);
}

#endif // #elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
