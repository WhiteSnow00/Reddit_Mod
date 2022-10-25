#pragma once
#if defined VERTEX_SHADER
#include <std2_texture.glsl>

#ifndef sc_ScreenTextureHasSwappedViews
#define sc_ScreenTextureHasSwappedViews 0
#elif sc_ScreenTextureHasSwappedViews == 1
#undef sc_ScreenTextureHasSwappedViews
#define sc_ScreenTextureHasSwappedViews 1
#endif
#ifndef sc_ScreenTextureLayout
#define sc_ScreenTextureLayout 0
#endif
struct sc_Camera_t
{
    vec3 position;
    float aspect;
    vec2 clipPlanes;
};

#ifndef sc_PointLightsCount
#define sc_PointLightsCount 0
#endif

struct sc_PointLight_t
{
    vec3 position;
    vec4 color;
};

#ifndef sc_DirectionalLightsCount
#define sc_DirectionalLightsCount 0
#endif

struct sc_DirectionalLight_t
{
    vec3 direction;
    vec4 color;
};

#ifndef sc_AmbientLightsCount
#define sc_AmbientLightsCount 0
#endif

struct sc_AmbientLight_t
{
    vec3 color;
    float intensity;
};

#ifndef SC_DEVICE_CLASS
#define SC_DEVICE_CLASS -1
#endif
#ifndef sc_RenderingSpace
#define sc_RenderingSpace -1
#endif
#ifndef sc_StereoRendering_IsClipDistanceEnabled
#define sc_StereoRendering_IsClipDistanceEnabled 0
#endif
#ifndef SC_GL_FRAGMENT_PRECISION_HIGH
#define SC_GL_FRAGMENT_PRECISION_HIGH 0
#elif SC_GL_FRAGMENT_PRECISION_HIGH == 1
#undef SC_GL_FRAGMENT_PRECISION_HIGH
#define SC_GL_FRAGMENT_PRECISION_HIGH 1
#endif
#ifndef ENABLE_STIPPLE_PATTERN_TEST
#define ENABLE_STIPPLE_PATTERN_TEST 0
#elif ENABLE_STIPPLE_PATTERN_TEST == 1
#undef ENABLE_STIPPLE_PATTERN_TEST
#define ENABLE_STIPPLE_PATTERN_TEST 1
#endif
#ifndef sc_IsEditor
#define sc_IsEditor 0
#elif sc_IsEditor == 1
#undef sc_IsEditor
#define sc_IsEditor 1
#endif
#ifndef sc_FramebufferFetch
#define sc_FramebufferFetch 0
#elif sc_FramebufferFetch == 1
#undef sc_FramebufferFetch
#define sc_FramebufferFetch 1
#endif
#ifndef sc_AmbientLightMode0
#define sc_AmbientLightMode0 0
#endif
#ifndef sc_AmbientLightMode1
#define sc_AmbientLightMode1 0
#endif
#ifndef sc_AmbientLightMode2
#define sc_AmbientLightMode2 0
#endif
#ifndef sc_AmbientLightMode_Constant
#define sc_AmbientLightMode_Constant 0
#endif
#ifndef sc_AmbientLightMode_SphericalHarmonics
#define sc_AmbientLightMode_SphericalHarmonics 0
#endif
#ifndef sc_AmbientLightMode_EnvironmentMap
#define sc_AmbientLightMode_EnvironmentMap 0
#endif
#ifndef sc_AmbientLightMode_FromCamera
#define sc_AmbientLightMode_FromCamera 0
#endif
#ifndef sc_EnvLightMode
#define sc_EnvLightMode 0
#endif
#ifndef sc_ProjectiveShadowsCaster
#define sc_ProjectiveShadowsCaster 0
#elif sc_ProjectiveShadowsCaster == 1
#undef sc_ProjectiveShadowsCaster
#define sc_ProjectiveShadowsCaster 1
#endif
#ifndef sc_ProjectiveShadowsReceiver
#define sc_ProjectiveShadowsReceiver 0
#elif sc_ProjectiveShadowsReceiver == 1
#undef sc_ProjectiveShadowsReceiver
#define sc_ProjectiveShadowsReceiver 1
#endif
#ifndef sc_MaxTextureImageUnits
#define sc_MaxTextureImageUnits 0
#endif
#ifndef sc_HasDiffuseEnvmap
#define sc_HasDiffuseEnvmap 0
#elif sc_HasDiffuseEnvmap == 1
#undef sc_HasDiffuseEnvmap
#define sc_HasDiffuseEnvmap 1
#endif
#ifndef sc_ShaderComplexityAnalyzer
#define sc_ShaderComplexityAnalyzer 0
#elif sc_ShaderComplexityAnalyzer == 1
#undef sc_ShaderComplexityAnalyzer
#define sc_ShaderComplexityAnalyzer 1
#endif
#ifndef UseViewSpaceDepthVariant
#define UseViewSpaceDepthVariant 1
#elif UseViewSpaceDepthVariant == 1
#undef UseViewSpaceDepthVariant
#define UseViewSpaceDepthVariant 1
#endif
#ifndef sc_OITDepthBoundsPass
#define sc_OITDepthBoundsPass 0
#elif sc_OITDepthBoundsPass == 1
#undef sc_OITDepthBoundsPass
#define sc_OITDepthBoundsPass 1
#endif
#ifndef sc_OITDepthPrepass
#define sc_OITDepthPrepass 0
#elif sc_OITDepthPrepass == 1
#undef sc_OITDepthPrepass
#define sc_OITDepthPrepass 1
#endif
#ifndef sc_OITDepthGatherPass
#define sc_OITDepthGatherPass 0
#elif sc_OITDepthGatherPass == 1
#undef sc_OITDepthGatherPass
#define sc_OITDepthGatherPass 1
#endif
#ifndef sc_OITCompositingPass
#define sc_OITCompositingPass 0
#elif sc_OITCompositingPass == 1
#undef sc_OITCompositingPass
#define sc_OITCompositingPass 1
#endif
#ifndef sc_OITFrontLayerPass
#define sc_OITFrontLayerPass 0
#elif sc_OITFrontLayerPass == 1
#undef sc_OITFrontLayerPass
#define sc_OITFrontLayerPass 1
#endif
#ifndef sc_OITMaxLayers4
#define sc_OITMaxLayers4 0
#elif sc_OITMaxLayers4 == 1
#undef sc_OITMaxLayers4
#define sc_OITMaxLayers4 1
#endif
#ifndef sc_OITMaxLayers4Plus1
#define sc_OITMaxLayers4Plus1 0
#elif sc_OITMaxLayers4Plus1 == 1
#undef sc_OITMaxLayers4Plus1
#define sc_OITMaxLayers4Plus1 1
#endif
#ifndef sc_OITMaxLayers8
#define sc_OITMaxLayers8 0
#elif sc_OITMaxLayers8 == 1
#undef sc_OITMaxLayers8
#define sc_OITMaxLayers8 1
#endif
#ifndef sc_OITMaxLayersVisualizeLayerCount
#define sc_OITMaxLayersVisualizeLayerCount 0
#elif sc_OITMaxLayersVisualizeLayerCount == 1
#undef sc_OITMaxLayersVisualizeLayerCount
#define sc_OITMaxLayersVisualizeLayerCount 1
#endif
#ifndef sc_BlendMode_Disabled
#define sc_BlendMode_Disabled 0
#elif sc_BlendMode_Disabled == 1
#undef sc_BlendMode_Disabled
#define sc_BlendMode_Disabled 1
#endif
#ifndef sc_BlendMode_Normal
#define sc_BlendMode_Normal 0
#elif sc_BlendMode_Normal == 1
#undef sc_BlendMode_Normal
#define sc_BlendMode_Normal 1
#endif
#ifndef sc_BlendMode_Multiply
#define sc_BlendMode_Multiply 0
#elif sc_BlendMode_Multiply == 1
#undef sc_BlendMode_Multiply
#define sc_BlendMode_Multiply 1
#endif
#ifndef sc_BlendMode_Add
#define sc_BlendMode_Add 0
#elif sc_BlendMode_Add == 1
#undef sc_BlendMode_Add
#define sc_BlendMode_Add 1
#endif
#ifndef sc_BlendMode_Screen
#define sc_BlendMode_Screen 0
#elif sc_BlendMode_Screen == 1
#undef sc_BlendMode_Screen
#define sc_BlendMode_Screen 1
#endif
#ifndef sc_BlendMode_PremultipliedAlpha
#define sc_BlendMode_PremultipliedAlpha 0
#elif sc_BlendMode_PremultipliedAlpha == 1
#undef sc_BlendMode_PremultipliedAlpha
#define sc_BlendMode_PremultipliedAlpha 1
#endif
#ifndef sc_BlendMode_AlphaToCoverage
#define sc_BlendMode_AlphaToCoverage 0
#elif sc_BlendMode_AlphaToCoverage == 1
#undef sc_BlendMode_AlphaToCoverage
#define sc_BlendMode_AlphaToCoverage 1
#endif
#ifndef sc_BlendMode_MultiplyOriginal
#define sc_BlendMode_MultiplyOriginal 0
#elif sc_BlendMode_MultiplyOriginal == 1
#undef sc_BlendMode_MultiplyOriginal
#define sc_BlendMode_MultiplyOriginal 1
#endif
#ifndef sc_BlendMode_AddWithAlphaFactor
#define sc_BlendMode_AddWithAlphaFactor 0
#elif sc_BlendMode_AddWithAlphaFactor == 1
#undef sc_BlendMode_AddWithAlphaFactor
#define sc_BlendMode_AddWithAlphaFactor 1
#endif
#ifndef sc_BlendMode_Min
#define sc_BlendMode_Min 0
#elif sc_BlendMode_Min == 1
#undef sc_BlendMode_Min
#define sc_BlendMode_Min 1
#endif
#ifndef sc_BlendMode_Max
#define sc_BlendMode_Max 0
#elif sc_BlendMode_Max == 1
#undef sc_BlendMode_Max
#define sc_BlendMode_Max 1
#endif
#ifndef sc_BlendMode_AlphaTest
#define sc_BlendMode_AlphaTest 0
#elif sc_BlendMode_AlphaTest == 1
#undef sc_BlendMode_AlphaTest
#define sc_BlendMode_AlphaTest 1
#endif
#ifndef sc_BlendMode_ColoredGlass
#define sc_BlendMode_ColoredGlass 0
#elif sc_BlendMode_ColoredGlass == 1
#undef sc_BlendMode_ColoredGlass
#define sc_BlendMode_ColoredGlass 1
#endif
#ifndef sc_BlendMode_PremultipliedAlphaHardware
#define sc_BlendMode_PremultipliedAlphaHardware 0
#elif sc_BlendMode_PremultipliedAlphaHardware == 1
#undef sc_BlendMode_PremultipliedAlphaHardware
#define sc_BlendMode_PremultipliedAlphaHardware 1
#endif
#ifndef sc_BlendMode_Custom
#define sc_BlendMode_Custom 0
#elif sc_BlendMode_Custom == 1
#undef sc_BlendMode_Custom
#define sc_BlendMode_Custom 1
#endif
#ifndef sc_BlendMode_Software
#define sc_BlendMode_Software 0
#elif sc_BlendMode_Software == 1
#undef sc_BlendMode_Software
#define sc_BlendMode_Software 1
#endif
#ifndef sc_BlendMode_Hardware
#define sc_BlendMode_Hardware 0
#elif sc_BlendMode_Hardware == 1
#undef sc_BlendMode_Hardware
#define sc_BlendMode_Hardware 1
#endif

struct sc_AmbientLightCompatibility_t
{
    vec3 color;
};

uniform vec4 sc_ScreenTextureDims;
uniform mediump sampler2DArray sc_ScreenTextureArrSC;
uniform mediump sampler2D sc_ScreenTexture;
uniform mediump sampler2D sc_EnvmapDiffuse;
uniform vec4 sc_EnvmapDiffuseSize;
uniform mediump sampler2D sc_EnvmapSpecular;
uniform vec4 sc_EnvmapSpecularSize;
uniform vec3 sc_EnvmapRotation;
uniform float sc_EnvmapExposure;
uniform vec3 sc_Sh[9];
uniform float sc_ShIntensity;
uniform vec4 sc_Time;
uniform vec4 sc_GeometryInfo;
uniform mat4 sc_ModelViewProjectionMatrixArray[sc_NumStereoViews];
uniform mat4 sc_ModelViewProjectionMatrixInverseArray[sc_NumStereoViews];
uniform mat4 sc_ViewProjectionMatrixArray[sc_NumStereoViews];
uniform mat4 sc_ViewProjectionMatrixInverseArray[sc_NumStereoViews];
uniform mat4 sc_ModelViewMatrixArray[sc_NumStereoViews];
uniform mat4 sc_ModelViewMatrixInverseArray[sc_NumStereoViews];
uniform mat3 sc_ViewNormalMatrixArray[sc_NumStereoViews];
uniform mat3 sc_ViewNormalMatrixInverseArray[sc_NumStereoViews];
uniform mat4 sc_ProjectionMatrixArray[sc_NumStereoViews];
uniform mat4 sc_ProjectionMatrixInverseArray[sc_NumStereoViews];
uniform mat4 sc_ViewMatrixArray[sc_NumStereoViews];
uniform mat4 sc_ViewMatrixInverseArray[sc_NumStereoViews];
uniform mat4 sc_ModelMatrix;
uniform mat4 sc_ModelMatrixInverse;
uniform mat3 sc_NormalMatrix;
uniform mat3 sc_NormalMatrixInverse;
uniform vec3 sc_LocalAabbMin;
uniform vec3 sc_LocalAabbMax;
uniform vec3 sc_WorldAabbMin;
uniform vec3 sc_WorldAabbMax;
uniform vec4 sc_WindowToViewportTransform;
uniform sc_Camera_t sc_Camera;
uniform sc_PointLight_t sc_PointLights[sc_PointLightsCount + 1];
uniform sc_DirectionalLight_t sc_DirectionalLights[sc_DirectionalLightsCount + 1];
uniform sc_AmbientLight_t sc_AmbientLights[sc_AmbientLightsCount + 1];
uniform vec4 sc_ScreenTextureSize;
uniform vec4 sc_ScreenTextureDimsRecip;
uniform vec4 sc_ScreenTextureView;

varying float varClipDistance;

vec2 sc_ScreenTextureGetDims2D()
{
    return sc_ScreenTextureDims.xy;
}

int sc_ScreenTextureGetStereoViewIndex()
{
    #if (sc_ScreenTextureHasSwappedViews)
    {
        return 1 - sc_GetStereoViewIndex();
    }
    #else // #if (sc_ScreenTextureHasSwappedViews)
    {
        return sc_GetStereoViewIndex();
    }
    #endif // #else // #if (sc_ScreenTextureHasSwappedViews)
}

vec4 sc_ScreenTextureSampleLevel(vec2 uv, float level)
{
    #if (sc_CanUseTextureLod)
    {
        #if (sc_ScreenTextureLayout==2)
        {
            vec2 param = sc_ScreenTextureGetDims2D();
            vec2 param_1 = uv;
            int param_2 = sc_ScreenTextureLayout;
            int param_3 = 0;
            float param_4 = level;
            return sc_SampleViewLevel(sc_ScreenTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ScreenTextureLayout==2)
        {
            vec2 param_5 = sc_ScreenTextureGetDims2D();
            vec2 param_6 = uv;
            int param_7 = sc_ScreenTextureLayout;
            int param_8 = 0;
            float param_9 = level;
            return sc_SampleViewLevel(sc_ScreenTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ScreenTextureLayout==2)
    }
    #else // #if (sc_CanUseTextureLod)
    {
        return vec4(0.0);
    }
    #endif // #else // #if (sc_CanUseTextureLod)
}

vec4 sc_ScreenTextureSampleBias(vec2 uv, float bias)
{
    #if (0)
    {
        #if (sc_ScreenTextureLayout==2)
        {
            vec2 param = sc_ScreenTextureGetDims2D();
            vec2 param_1 = uv;
            int param_2 = sc_ScreenTextureLayout;
            int param_3 = 0;
            float param_4 = bias;
            return sc_SampleView(sc_ScreenTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ScreenTextureLayout==2)
        {
            vec2 param_5 = sc_ScreenTextureGetDims2D();
            vec2 param_6 = uv;
            int param_7 = sc_ScreenTextureLayout;
            int param_8 = 0;
            float param_9 = bias;
            return sc_SampleView(sc_ScreenTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ScreenTextureLayout==2)
    }
    #else // #if (0)
    {
        #if (sc_CanUseTextureLod)
        {
            vec2 param_10 = uv;
            float param_11 = bias;
            return sc_ScreenTextureSampleLevel(param_10, param_11);
        }
        #else // #if (sc_CanUseTextureLod)
        {
            return vec4(0.0);
        }
        #endif // #else // #if (sc_CanUseTextureLod)
    }
    #endif // #else // #if (0)
}

vec4 sc_ScreenTextureSampleViewIndexLevel(vec2 uv, int viewIndex, float level)
{
    #if (sc_CanUseTextureLod)
    {
        #if (sc_ScreenTextureLayout==2)
        {
            vec2 param = sc_ScreenTextureGetDims2D();
            vec2 param_1 = uv;
            int param_2 = sc_ScreenTextureLayout;
            int param_3 = viewIndex;
            float param_4 = level;
            return sc_SampleViewLevel(sc_ScreenTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ScreenTextureLayout==2)
        {
            vec2 param_5 = sc_ScreenTextureGetDims2D();
            vec2 param_6 = uv;
            int param_7 = sc_ScreenTextureLayout;
            int param_8 = viewIndex;
            float param_9 = level;
            return sc_SampleViewLevel(sc_ScreenTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ScreenTextureLayout==2)
    }
    #else // #if (sc_CanUseTextureLod)
    {
        return vec4(0.0);
    }
    #endif // #else // #if (sc_CanUseTextureLod)
}

vec4 sc_ScreenTextureSampleViewLevel(vec2 uv, float level)
{
    vec2 param = uv;
    int param_1 = sc_ScreenTextureGetStereoViewIndex();
    float param_2 = level;
    return sc_ScreenTextureSampleViewIndexLevel(param, param_1, param_2);
}

vec4 sc_ScreenTextureSampleViewIndexBias(vec2 uv, int viewIndex, float bias)
{
    #if (0)
    {
        #if (sc_ScreenTextureLayout==2)
        {
            vec2 param = sc_ScreenTextureGetDims2D();
            vec2 param_1 = uv;
            int param_2 = sc_ScreenTextureLayout;
            int param_3 = viewIndex;
            float param_4 = bias;
            return sc_SampleView(sc_ScreenTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ScreenTextureLayout==2)
        {
            vec2 param_5 = sc_ScreenTextureGetDims2D();
            vec2 param_6 = uv;
            int param_7 = sc_ScreenTextureLayout;
            int param_8 = viewIndex;
            float param_9 = bias;
            return sc_SampleView(sc_ScreenTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ScreenTextureLayout==2)
    }
    #else // #if (0)
    {
        #if (sc_CanUseTextureLod)
        {
            vec2 param_10 = uv;
            int param_11 = viewIndex;
            float param_12 = bias;
            return sc_ScreenTextureSampleViewIndexLevel(param_10, param_11, param_12);
        }
        #else // #if (sc_CanUseTextureLod)
        {
            return vec4(0.0);
        }
        #endif // #else // #if (sc_CanUseTextureLod)
    }
    #endif // #else // #if (0)
}

vec4 sc_ScreenTextureSampleViewBias(vec2 uv, float bias)
{
    vec2 param = uv;
    int param_1 = sc_ScreenTextureGetStereoViewIndex();
    float param_2 = bias;
    return sc_ScreenTextureSampleViewIndexBias(param, param_1, param_2);
}

vec4 sc_ScreenTextureSampleViewIndex(vec2 uv, int viewIndex)
{
    vec2 param = uv;
    int param_1 = viewIndex;
    float param_2 = 0.0;
    return sc_ScreenTextureSampleViewIndexBias(param, param_1, param_2);
}

vec4 sc_ScreenTextureSampleView(vec2 uv)
{
    vec2 param = uv;
    int param_1 = sc_ScreenTextureGetStereoViewIndex();
    return sc_ScreenTextureSampleViewIndex(param, param_1);
}

#elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
#include <std2_texture.glsl>

#ifndef sc_ScreenTextureHasSwappedViews
#define sc_ScreenTextureHasSwappedViews 0
#elif sc_ScreenTextureHasSwappedViews == 1
#undef sc_ScreenTextureHasSwappedViews
#define sc_ScreenTextureHasSwappedViews 1
#endif
#ifndef sc_ScreenTextureLayout
#define sc_ScreenTextureLayout 0
#endif
struct sc_Camera_t
{
    highp vec3 position;
    highp float aspect;
    highp vec2 clipPlanes;
};

#ifndef sc_PointLightsCount
#define sc_PointLightsCount 0
#endif

struct sc_PointLight_t
{
    highp vec3 position;
    highp vec4 color;
};

#ifndef sc_DirectionalLightsCount
#define sc_DirectionalLightsCount 0
#endif

struct sc_DirectionalLight_t
{
    highp vec3 direction;
    highp vec4 color;
};

#ifndef sc_AmbientLightsCount
#define sc_AmbientLightsCount 0
#endif

struct sc_AmbientLight_t
{
    highp vec3 color;
    highp float intensity;
};

#ifndef SC_DEVICE_CLASS
#define SC_DEVICE_CLASS -1
#endif
#ifndef sc_RenderingSpace
#define sc_RenderingSpace -1
#endif
#ifndef sc_StereoRendering_IsClipDistanceEnabled
#define sc_StereoRendering_IsClipDistanceEnabled 0
#endif
#ifndef SC_GL_FRAGMENT_PRECISION_HIGH
#define SC_GL_FRAGMENT_PRECISION_HIGH 0
#elif SC_GL_FRAGMENT_PRECISION_HIGH == 1
#undef SC_GL_FRAGMENT_PRECISION_HIGH
#define SC_GL_FRAGMENT_PRECISION_HIGH 1
#endif
#ifndef ENABLE_STIPPLE_PATTERN_TEST
#define ENABLE_STIPPLE_PATTERN_TEST 0
#elif ENABLE_STIPPLE_PATTERN_TEST == 1
#undef ENABLE_STIPPLE_PATTERN_TEST
#define ENABLE_STIPPLE_PATTERN_TEST 1
#endif
#ifndef sc_IsEditor
#define sc_IsEditor 0
#elif sc_IsEditor == 1
#undef sc_IsEditor
#define sc_IsEditor 1
#endif
#ifndef sc_FramebufferFetch
#define sc_FramebufferFetch 0
#elif sc_FramebufferFetch == 1
#undef sc_FramebufferFetch
#define sc_FramebufferFetch 1
#endif
#ifndef sc_AmbientLightMode0
#define sc_AmbientLightMode0 0
#endif
#ifndef sc_AmbientLightMode1
#define sc_AmbientLightMode1 0
#endif
#ifndef sc_AmbientLightMode2
#define sc_AmbientLightMode2 0
#endif
#ifndef sc_AmbientLightMode_Constant
#define sc_AmbientLightMode_Constant 0
#endif
#ifndef sc_AmbientLightMode_SphericalHarmonics
#define sc_AmbientLightMode_SphericalHarmonics 0
#endif
#ifndef sc_AmbientLightMode_EnvironmentMap
#define sc_AmbientLightMode_EnvironmentMap 0
#endif
#ifndef sc_AmbientLightMode_FromCamera
#define sc_AmbientLightMode_FromCamera 0
#endif
#ifndef sc_EnvLightMode
#define sc_EnvLightMode 0
#endif
#ifndef sc_ProjectiveShadowsCaster
#define sc_ProjectiveShadowsCaster 0
#elif sc_ProjectiveShadowsCaster == 1
#undef sc_ProjectiveShadowsCaster
#define sc_ProjectiveShadowsCaster 1
#endif
#ifndef sc_ProjectiveShadowsReceiver
#define sc_ProjectiveShadowsReceiver 0
#elif sc_ProjectiveShadowsReceiver == 1
#undef sc_ProjectiveShadowsReceiver
#define sc_ProjectiveShadowsReceiver 1
#endif
#ifndef sc_MaxTextureImageUnits
#define sc_MaxTextureImageUnits 0
#endif
#ifndef sc_HasDiffuseEnvmap
#define sc_HasDiffuseEnvmap 0
#elif sc_HasDiffuseEnvmap == 1
#undef sc_HasDiffuseEnvmap
#define sc_HasDiffuseEnvmap 1
#endif
#ifndef sc_ShaderComplexityAnalyzer
#define sc_ShaderComplexityAnalyzer 0
#elif sc_ShaderComplexityAnalyzer == 1
#undef sc_ShaderComplexityAnalyzer
#define sc_ShaderComplexityAnalyzer 1
#endif
#ifndef UseViewSpaceDepthVariant
#define UseViewSpaceDepthVariant 1
#elif UseViewSpaceDepthVariant == 1
#undef UseViewSpaceDepthVariant
#define UseViewSpaceDepthVariant 1
#endif
#ifndef sc_OITDepthBoundsPass
#define sc_OITDepthBoundsPass 0
#elif sc_OITDepthBoundsPass == 1
#undef sc_OITDepthBoundsPass
#define sc_OITDepthBoundsPass 1
#endif
#ifndef sc_OITDepthPrepass
#define sc_OITDepthPrepass 0
#elif sc_OITDepthPrepass == 1
#undef sc_OITDepthPrepass
#define sc_OITDepthPrepass 1
#endif
#ifndef sc_OITDepthGatherPass
#define sc_OITDepthGatherPass 0
#elif sc_OITDepthGatherPass == 1
#undef sc_OITDepthGatherPass
#define sc_OITDepthGatherPass 1
#endif
#ifndef sc_OITCompositingPass
#define sc_OITCompositingPass 0
#elif sc_OITCompositingPass == 1
#undef sc_OITCompositingPass
#define sc_OITCompositingPass 1
#endif
#ifndef sc_OITFrontLayerPass
#define sc_OITFrontLayerPass 0
#elif sc_OITFrontLayerPass == 1
#undef sc_OITFrontLayerPass
#define sc_OITFrontLayerPass 1
#endif
#ifndef sc_OITMaxLayers4
#define sc_OITMaxLayers4 0
#elif sc_OITMaxLayers4 == 1
#undef sc_OITMaxLayers4
#define sc_OITMaxLayers4 1
#endif
#ifndef sc_OITMaxLayers4Plus1
#define sc_OITMaxLayers4Plus1 0
#elif sc_OITMaxLayers4Plus1 == 1
#undef sc_OITMaxLayers4Plus1
#define sc_OITMaxLayers4Plus1 1
#endif
#ifndef sc_OITMaxLayers8
#define sc_OITMaxLayers8 0
#elif sc_OITMaxLayers8 == 1
#undef sc_OITMaxLayers8
#define sc_OITMaxLayers8 1
#endif
#ifndef sc_OITMaxLayersVisualizeLayerCount
#define sc_OITMaxLayersVisualizeLayerCount 0
#elif sc_OITMaxLayersVisualizeLayerCount == 1
#undef sc_OITMaxLayersVisualizeLayerCount
#define sc_OITMaxLayersVisualizeLayerCount 1
#endif
#ifndef sc_BlendMode_Disabled
#define sc_BlendMode_Disabled 0
#elif sc_BlendMode_Disabled == 1
#undef sc_BlendMode_Disabled
#define sc_BlendMode_Disabled 1
#endif
#ifndef sc_BlendMode_Normal
#define sc_BlendMode_Normal 0
#elif sc_BlendMode_Normal == 1
#undef sc_BlendMode_Normal
#define sc_BlendMode_Normal 1
#endif
#ifndef sc_BlendMode_Multiply
#define sc_BlendMode_Multiply 0
#elif sc_BlendMode_Multiply == 1
#undef sc_BlendMode_Multiply
#define sc_BlendMode_Multiply 1
#endif
#ifndef sc_BlendMode_Add
#define sc_BlendMode_Add 0
#elif sc_BlendMode_Add == 1
#undef sc_BlendMode_Add
#define sc_BlendMode_Add 1
#endif
#ifndef sc_BlendMode_Screen
#define sc_BlendMode_Screen 0
#elif sc_BlendMode_Screen == 1
#undef sc_BlendMode_Screen
#define sc_BlendMode_Screen 1
#endif
#ifndef sc_BlendMode_PremultipliedAlpha
#define sc_BlendMode_PremultipliedAlpha 0
#elif sc_BlendMode_PremultipliedAlpha == 1
#undef sc_BlendMode_PremultipliedAlpha
#define sc_BlendMode_PremultipliedAlpha 1
#endif
#ifndef sc_BlendMode_AlphaToCoverage
#define sc_BlendMode_AlphaToCoverage 0
#elif sc_BlendMode_AlphaToCoverage == 1
#undef sc_BlendMode_AlphaToCoverage
#define sc_BlendMode_AlphaToCoverage 1
#endif
#ifndef sc_BlendMode_MultiplyOriginal
#define sc_BlendMode_MultiplyOriginal 0
#elif sc_BlendMode_MultiplyOriginal == 1
#undef sc_BlendMode_MultiplyOriginal
#define sc_BlendMode_MultiplyOriginal 1
#endif
#ifndef sc_BlendMode_AddWithAlphaFactor
#define sc_BlendMode_AddWithAlphaFactor 0
#elif sc_BlendMode_AddWithAlphaFactor == 1
#undef sc_BlendMode_AddWithAlphaFactor
#define sc_BlendMode_AddWithAlphaFactor 1
#endif
#ifndef sc_BlendMode_Min
#define sc_BlendMode_Min 0
#elif sc_BlendMode_Min == 1
#undef sc_BlendMode_Min
#define sc_BlendMode_Min 1
#endif
#ifndef sc_BlendMode_Max
#define sc_BlendMode_Max 0
#elif sc_BlendMode_Max == 1
#undef sc_BlendMode_Max
#define sc_BlendMode_Max 1
#endif
#ifndef sc_BlendMode_AlphaTest
#define sc_BlendMode_AlphaTest 0
#elif sc_BlendMode_AlphaTest == 1
#undef sc_BlendMode_AlphaTest
#define sc_BlendMode_AlphaTest 1
#endif
#ifndef sc_BlendMode_ColoredGlass
#define sc_BlendMode_ColoredGlass 0
#elif sc_BlendMode_ColoredGlass == 1
#undef sc_BlendMode_ColoredGlass
#define sc_BlendMode_ColoredGlass 1
#endif
#ifndef sc_BlendMode_PremultipliedAlphaHardware
#define sc_BlendMode_PremultipliedAlphaHardware 0
#elif sc_BlendMode_PremultipliedAlphaHardware == 1
#undef sc_BlendMode_PremultipliedAlphaHardware
#define sc_BlendMode_PremultipliedAlphaHardware 1
#endif
#ifndef sc_BlendMode_Custom
#define sc_BlendMode_Custom 0
#elif sc_BlendMode_Custom == 1
#undef sc_BlendMode_Custom
#define sc_BlendMode_Custom 1
#endif
#ifndef sc_BlendMode_Software
#define sc_BlendMode_Software 0
#elif sc_BlendMode_Software == 1
#undef sc_BlendMode_Software
#define sc_BlendMode_Software 1
#endif
#ifndef sc_BlendMode_Hardware
#define sc_BlendMode_Hardware 0
#elif sc_BlendMode_Hardware == 1
#undef sc_BlendMode_Hardware
#define sc_BlendMode_Hardware 1
#endif

struct sc_AmbientLightCompatibility_t
{
    highp vec3 color;
};

uniform highp vec4 sc_ScreenTextureDims;
uniform mediump sampler2DArray sc_ScreenTextureArrSC;
uniform mediump sampler2D sc_ScreenTexture;
uniform mediump sampler2D sc_EnvmapDiffuse;
uniform highp vec4 sc_EnvmapDiffuseSize;
uniform mediump sampler2D sc_EnvmapSpecular;
uniform highp vec4 sc_EnvmapSpecularSize;
uniform highp vec3 sc_EnvmapRotation;
uniform highp float sc_EnvmapExposure;
uniform highp vec3 sc_Sh[9];
uniform highp float sc_ShIntensity;
uniform highp vec4 sc_Time;
uniform highp vec4 sc_GeometryInfo;
uniform highp mat4 sc_ModelViewProjectionMatrixArray[sc_NumStereoViews];
uniform highp mat4 sc_ModelViewProjectionMatrixInverseArray[sc_NumStereoViews];
uniform highp mat4 sc_ViewProjectionMatrixArray[sc_NumStereoViews];
uniform highp mat4 sc_ViewProjectionMatrixInverseArray[sc_NumStereoViews];
uniform highp mat4 sc_ModelViewMatrixArray[sc_NumStereoViews];
uniform highp mat4 sc_ModelViewMatrixInverseArray[sc_NumStereoViews];
uniform highp mat3 sc_ViewNormalMatrixArray[sc_NumStereoViews];
uniform highp mat3 sc_ViewNormalMatrixInverseArray[sc_NumStereoViews];
uniform highp mat4 sc_ProjectionMatrixArray[sc_NumStereoViews];
uniform highp mat4 sc_ProjectionMatrixInverseArray[sc_NumStereoViews];
uniform highp mat4 sc_ViewMatrixArray[sc_NumStereoViews];
uniform highp mat4 sc_ViewMatrixInverseArray[sc_NumStereoViews];
uniform highp mat4 sc_ModelMatrix;
uniform highp mat4 sc_ModelMatrixInverse;
uniform highp mat3 sc_NormalMatrix;
uniform highp mat3 sc_NormalMatrixInverse;
uniform highp vec3 sc_LocalAabbMin;
uniform highp vec3 sc_LocalAabbMax;
uniform highp vec3 sc_WorldAabbMin;
uniform highp vec3 sc_WorldAabbMax;
uniform highp vec4 sc_WindowToViewportTransform;
uniform sc_Camera_t sc_Camera;
uniform sc_PointLight_t sc_PointLights[sc_PointLightsCount + 1];
uniform sc_DirectionalLight_t sc_DirectionalLights[sc_DirectionalLightsCount + 1];
uniform sc_AmbientLight_t sc_AmbientLights[sc_AmbientLightsCount + 1];
uniform highp vec4 sc_ScreenTextureSize;
uniform highp vec4 sc_ScreenTextureDimsRecip;
uniform highp vec4 sc_ScreenTextureView;

varying highp float varClipDistance;

highp vec2 sc_ScreenTextureGetDims2D()
{
    return sc_ScreenTextureDims.xy;
}

int sc_ScreenTextureGetStereoViewIndex()
{
    #if (sc_ScreenTextureHasSwappedViews)
    {
        return 1 - sc_GetStereoViewIndex();
    }
    #else // #if (sc_ScreenTextureHasSwappedViews)
    {
        return sc_GetStereoViewIndex();
    }
    #endif // #else // #if (sc_ScreenTextureHasSwappedViews)
}

highp vec4 sc_ScreenTextureSampleLevel(highp vec2 uv, highp float level)
{
    #if (sc_CanUseTextureLod)
    {
        #if (sc_ScreenTextureLayout==2)
        {
            highp vec2 param = sc_ScreenTextureGetDims2D();
            highp vec2 param_1 = uv;
            int param_2 = sc_ScreenTextureLayout;
            int param_3 = 0;
            highp float param_4 = level;
            return sc_SampleViewLevel(sc_ScreenTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ScreenTextureLayout==2)
        {
            highp vec2 param_5 = sc_ScreenTextureGetDims2D();
            highp vec2 param_6 = uv;
            int param_7 = sc_ScreenTextureLayout;
            int param_8 = 0;
            highp float param_9 = level;
            return sc_SampleViewLevel(sc_ScreenTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ScreenTextureLayout==2)
    }
    #else // #if (sc_CanUseTextureLod)
    {
        return vec4(0.0);
    }
    #endif // #else // #if (sc_CanUseTextureLod)
}

highp vec4 sc_ScreenTextureSampleBias(highp vec2 uv, highp float bias)
{
    #if (1)
    {
        #if (sc_ScreenTextureLayout==2)
        {
            highp vec2 param = sc_ScreenTextureGetDims2D();
            highp vec2 param_1 = uv;
            int param_2 = sc_ScreenTextureLayout;
            int param_3 = 0;
            highp float param_4 = bias;
            return sc_SampleView(sc_ScreenTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ScreenTextureLayout==2)
        {
            highp vec2 param_5 = sc_ScreenTextureGetDims2D();
            highp vec2 param_6 = uv;
            int param_7 = sc_ScreenTextureLayout;
            int param_8 = 0;
            highp float param_9 = bias;
            return sc_SampleView(sc_ScreenTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ScreenTextureLayout==2)
    }
    #else // #if (1)
    {
        #if (sc_CanUseTextureLod)
        {
            highp vec2 param_10 = uv;
            highp float param_11 = bias;
            return sc_ScreenTextureSampleLevel(param_10, param_11);
        }
        #else // #if (sc_CanUseTextureLod)
        {
            return vec4(0.0);
        }
        #endif // #else // #if (sc_CanUseTextureLod)
    }
    #endif // #else // #if (1)
}

highp vec4 sc_ScreenTextureSampleViewIndexLevel(highp vec2 uv, int viewIndex, highp float level)
{
    #if (sc_CanUseTextureLod)
    {
        #if (sc_ScreenTextureLayout==2)
        {
            highp vec2 param = sc_ScreenTextureGetDims2D();
            highp vec2 param_1 = uv;
            int param_2 = sc_ScreenTextureLayout;
            int param_3 = viewIndex;
            highp float param_4 = level;
            return sc_SampleViewLevel(sc_ScreenTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ScreenTextureLayout==2)
        {
            highp vec2 param_5 = sc_ScreenTextureGetDims2D();
            highp vec2 param_6 = uv;
            int param_7 = sc_ScreenTextureLayout;
            int param_8 = viewIndex;
            highp float param_9 = level;
            return sc_SampleViewLevel(sc_ScreenTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ScreenTextureLayout==2)
    }
    #else // #if (sc_CanUseTextureLod)
    {
        return vec4(0.0);
    }
    #endif // #else // #if (sc_CanUseTextureLod)
}

highp vec4 sc_ScreenTextureSampleViewLevel(highp vec2 uv, highp float level)
{
    highp vec2 param = uv;
    int param_1 = sc_ScreenTextureGetStereoViewIndex();
    highp float param_2 = level;
    return sc_ScreenTextureSampleViewIndexLevel(param, param_1, param_2);
}

highp vec4 sc_ScreenTextureSampleViewIndexBias(highp vec2 uv, int viewIndex, highp float bias)
{
    #if (1)
    {
        #if (sc_ScreenTextureLayout==2)
        {
            highp vec2 param = sc_ScreenTextureGetDims2D();
            highp vec2 param_1 = uv;
            int param_2 = sc_ScreenTextureLayout;
            int param_3 = viewIndex;
            highp float param_4 = bias;
            return sc_SampleView(sc_ScreenTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ScreenTextureLayout==2)
        {
            highp vec2 param_5 = sc_ScreenTextureGetDims2D();
            highp vec2 param_6 = uv;
            int param_7 = sc_ScreenTextureLayout;
            int param_8 = viewIndex;
            highp float param_9 = bias;
            return sc_SampleView(sc_ScreenTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ScreenTextureLayout==2)
    }
    #else // #if (1)
    {
        #if (sc_CanUseTextureLod)
        {
            highp vec2 param_10 = uv;
            int param_11 = viewIndex;
            highp float param_12 = bias;
            return sc_ScreenTextureSampleViewIndexLevel(param_10, param_11, param_12);
        }
        #else // #if (sc_CanUseTextureLod)
        {
            return vec4(0.0);
        }
        #endif // #else // #if (sc_CanUseTextureLod)
    }
    #endif // #else // #if (1)
}

highp vec4 sc_ScreenTextureSampleViewBias(highp vec2 uv, highp float bias)
{
    highp vec2 param = uv;
    int param_1 = sc_ScreenTextureGetStereoViewIndex();
    highp float param_2 = bias;
    return sc_ScreenTextureSampleViewIndexBias(param, param_1, param_2);
}

highp vec4 sc_ScreenTextureSampleViewIndex(highp vec2 uv, int viewIndex)
{
    highp vec2 param = uv;
    int param_1 = viewIndex;
    highp float param_2 = 0.0;
    return sc_ScreenTextureSampleViewIndexBias(param, param_1, param_2);
}

highp vec4 sc_ScreenTextureSampleView(highp vec2 uv)
{
    highp vec2 param = uv;
    int param_1 = sc_ScreenTextureGetStereoViewIndex();
    return sc_ScreenTextureSampleViewIndex(param, param_1);
}

#endif // #elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
