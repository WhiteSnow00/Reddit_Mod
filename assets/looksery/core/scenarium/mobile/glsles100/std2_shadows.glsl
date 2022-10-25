#pragma once
#if defined VERTEX_SHADER
#include <std2.glsl>

#ifndef sc_ShadowTextureHasSwappedViews
#define sc_ShadowTextureHasSwappedViews 0
#elif sc_ShadowTextureHasSwappedViews == 1
#undef sc_ShadowTextureHasSwappedViews
#define sc_ShadowTextureHasSwappedViews 1
#endif
#ifndef sc_ShadowTextureLayout
#define sc_ShadowTextureLayout 0
#endif
uniform vec4 sc_ShadowTextureDims;
uniform mediump sampler2DArray sc_ShadowTextureArrSC;
uniform mediump sampler2D sc_ShadowTexture;
uniform mat4 sc_ProjectorMatrix;
uniform float sc_ShadowDensity;
uniform vec4 sc_ShadowColor;
uniform vec4 sc_ShadowTextureSize;
uniform vec4 sc_ShadowTextureDimsRecip;
uniform vec4 sc_ShadowTextureView;

varying vec2 varShadowTex;

vec2 sc_ShadowTextureGetDims2D()
{
    return sc_ShadowTextureDims.xy;
}

int sc_ShadowTextureGetStereoViewIndex()
{
    #if (sc_ShadowTextureHasSwappedViews)
    {
        return 1 - sc_GetStereoViewIndex();
    }
    #else // #if (sc_ShadowTextureHasSwappedViews)
    {
        return sc_GetStereoViewIndex();
    }
    #endif // #else // #if (sc_ShadowTextureHasSwappedViews)
}

vec4 sc_ShadowTextureSampleLevel(vec2 uv, float level)
{
    #if (sc_CanUseTextureLod)
    {
        #if (sc_ShadowTextureLayout==2)
        {
            vec2 param = sc_ShadowTextureGetDims2D();
            vec2 param_1 = uv;
            int param_2 = sc_ShadowTextureLayout;
            int param_3 = 0;
            float param_4 = level;
            return sc_SampleViewLevel(sc_ShadowTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ShadowTextureLayout==2)
        {
            vec2 param_5 = sc_ShadowTextureGetDims2D();
            vec2 param_6 = uv;
            int param_7 = sc_ShadowTextureLayout;
            int param_8 = 0;
            float param_9 = level;
            return sc_SampleViewLevel(sc_ShadowTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ShadowTextureLayout==2)
    }
    #else // #if (sc_CanUseTextureLod)
    {
        return vec4(0.0);
    }
    #endif // #else // #if (sc_CanUseTextureLod)
}

vec4 sc_ShadowTextureSampleBias(vec2 uv, float bias)
{
    #if (0)
    {
        #if (sc_ShadowTextureLayout==2)
        {
            vec2 param = sc_ShadowTextureGetDims2D();
            vec2 param_1 = uv;
            int param_2 = sc_ShadowTextureLayout;
            int param_3 = 0;
            float param_4 = bias;
            return sc_SampleView(sc_ShadowTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ShadowTextureLayout==2)
        {
            vec2 param_5 = sc_ShadowTextureGetDims2D();
            vec2 param_6 = uv;
            int param_7 = sc_ShadowTextureLayout;
            int param_8 = 0;
            float param_9 = bias;
            return sc_SampleView(sc_ShadowTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ShadowTextureLayout==2)
    }
    #else // #if (0)
    {
        #if (sc_CanUseTextureLod)
        {
            vec2 param_10 = uv;
            float param_11 = bias;
            return sc_ShadowTextureSampleLevel(param_10, param_11);
        }
        #else // #if (sc_CanUseTextureLod)
        {
            return vec4(0.0);
        }
        #endif // #else // #if (sc_CanUseTextureLod)
    }
    #endif // #else // #if (0)
}

vec4 sc_ShadowTextureSampleViewIndexLevel(vec2 uv, int viewIndex, float level)
{
    #if (sc_CanUseTextureLod)
    {
        #if (sc_ShadowTextureLayout==2)
        {
            vec2 param = sc_ShadowTextureGetDims2D();
            vec2 param_1 = uv;
            int param_2 = sc_ShadowTextureLayout;
            int param_3 = viewIndex;
            float param_4 = level;
            return sc_SampleViewLevel(sc_ShadowTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ShadowTextureLayout==2)
        {
            vec2 param_5 = sc_ShadowTextureGetDims2D();
            vec2 param_6 = uv;
            int param_7 = sc_ShadowTextureLayout;
            int param_8 = viewIndex;
            float param_9 = level;
            return sc_SampleViewLevel(sc_ShadowTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ShadowTextureLayout==2)
    }
    #else // #if (sc_CanUseTextureLod)
    {
        return vec4(0.0);
    }
    #endif // #else // #if (sc_CanUseTextureLod)
}

vec4 sc_ShadowTextureSampleViewLevel(vec2 uv, float level)
{
    vec2 param = uv;
    int param_1 = sc_ShadowTextureGetStereoViewIndex();
    float param_2 = level;
    return sc_ShadowTextureSampleViewIndexLevel(param, param_1, param_2);
}

vec4 sc_ShadowTextureSampleViewIndexBias(vec2 uv, int viewIndex, float bias)
{
    #if (0)
    {
        #if (sc_ShadowTextureLayout==2)
        {
            vec2 param = sc_ShadowTextureGetDims2D();
            vec2 param_1 = uv;
            int param_2 = sc_ShadowTextureLayout;
            int param_3 = viewIndex;
            float param_4 = bias;
            return sc_SampleView(sc_ShadowTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ShadowTextureLayout==2)
        {
            vec2 param_5 = sc_ShadowTextureGetDims2D();
            vec2 param_6 = uv;
            int param_7 = sc_ShadowTextureLayout;
            int param_8 = viewIndex;
            float param_9 = bias;
            return sc_SampleView(sc_ShadowTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ShadowTextureLayout==2)
    }
    #else // #if (0)
    {
        #if (sc_CanUseTextureLod)
        {
            vec2 param_10 = uv;
            int param_11 = viewIndex;
            float param_12 = bias;
            return sc_ShadowTextureSampleViewIndexLevel(param_10, param_11, param_12);
        }
        #else // #if (sc_CanUseTextureLod)
        {
            return vec4(0.0);
        }
        #endif // #else // #if (sc_CanUseTextureLod)
    }
    #endif // #else // #if (0)
}

vec4 sc_ShadowTextureSampleViewBias(vec2 uv, float bias)
{
    vec2 param = uv;
    int param_1 = sc_ShadowTextureGetStereoViewIndex();
    float param_2 = bias;
    return sc_ShadowTextureSampleViewIndexBias(param, param_1, param_2);
}

vec4 sc_ShadowTextureSampleViewIndex(vec2 uv, int viewIndex)
{
    vec2 param = uv;
    int param_1 = viewIndex;
    float param_2 = 0.0;
    return sc_ShadowTextureSampleViewIndexBias(param, param_1, param_2);
}

vec4 sc_ShadowTextureSampleView(vec2 uv)
{
    vec2 param = uv;
    int param_1 = sc_ShadowTextureGetStereoViewIndex();
    return sc_ShadowTextureSampleViewIndex(param, param_1);
}

vec2 getProjectedTexCoords(vec4 vertexPosition)
{
    vec4 worldPos;
    #if (sc_RenderingSpace==2)
    {
        worldPos = vertexPosition;
    }
    #else // #if (sc_RenderingSpace==2)
    {
        #if (sc_RenderingSpace==1)
        {
            worldPos = sc_ModelMatrix * vertexPosition;
        }
        #endif // #if (sc_RenderingSpace==1)
    }
    #endif // #else // #if (sc_RenderingSpace==2)
    vec4 projectedUVs = sc_ProjectorMatrix * worldPos;
    return ((projectedUVs.xy / vec2(projectedUVs.w)) * 0.5) + vec2(0.5);
}

#elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
#include <std2.glsl>

#ifndef sc_ShadowTextureHasSwappedViews
#define sc_ShadowTextureHasSwappedViews 0
#elif sc_ShadowTextureHasSwappedViews == 1
#undef sc_ShadowTextureHasSwappedViews
#define sc_ShadowTextureHasSwappedViews 1
#endif
#ifndef sc_ShadowTextureLayout
#define sc_ShadowTextureLayout 0
#endif
uniform highp vec4 sc_ShadowTextureDims;
uniform mediump sampler2DArray sc_ShadowTextureArrSC;
uniform mediump sampler2D sc_ShadowTexture;
uniform highp float sc_ShadowDensity;
uniform highp vec4 sc_ShadowColor;
uniform highp mat4 sc_ProjectorMatrix;
uniform highp vec4 sc_ShadowTextureSize;
uniform highp vec4 sc_ShadowTextureDimsRecip;
uniform highp vec4 sc_ShadowTextureView;

varying highp vec2 varShadowTex;

highp vec2 sc_ShadowTextureGetDims2D()
{
    return sc_ShadowTextureDims.xy;
}

int sc_ShadowTextureGetStereoViewIndex()
{
    #if (sc_ShadowTextureHasSwappedViews)
    {
        return 1 - sc_GetStereoViewIndex();
    }
    #else // #if (sc_ShadowTextureHasSwappedViews)
    {
        return sc_GetStereoViewIndex();
    }
    #endif // #else // #if (sc_ShadowTextureHasSwappedViews)
}

highp vec4 sc_ShadowTextureSampleLevel(highp vec2 uv, highp float level)
{
    #if (sc_CanUseTextureLod)
    {
        #if (sc_ShadowTextureLayout==2)
        {
            highp vec2 param = sc_ShadowTextureGetDims2D();
            highp vec2 param_1 = uv;
            int param_2 = sc_ShadowTextureLayout;
            int param_3 = 0;
            highp float param_4 = level;
            return sc_SampleViewLevel(sc_ShadowTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ShadowTextureLayout==2)
        {
            highp vec2 param_5 = sc_ShadowTextureGetDims2D();
            highp vec2 param_6 = uv;
            int param_7 = sc_ShadowTextureLayout;
            int param_8 = 0;
            highp float param_9 = level;
            return sc_SampleViewLevel(sc_ShadowTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ShadowTextureLayout==2)
    }
    #else // #if (sc_CanUseTextureLod)
    {
        return vec4(0.0);
    }
    #endif // #else // #if (sc_CanUseTextureLod)
}

highp vec4 sc_ShadowTextureSampleBias(highp vec2 uv, highp float bias)
{
    #if (1)
    {
        #if (sc_ShadowTextureLayout==2)
        {
            highp vec2 param = sc_ShadowTextureGetDims2D();
            highp vec2 param_1 = uv;
            int param_2 = sc_ShadowTextureLayout;
            int param_3 = 0;
            highp float param_4 = bias;
            return sc_SampleView(sc_ShadowTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ShadowTextureLayout==2)
        {
            highp vec2 param_5 = sc_ShadowTextureGetDims2D();
            highp vec2 param_6 = uv;
            int param_7 = sc_ShadowTextureLayout;
            int param_8 = 0;
            highp float param_9 = bias;
            return sc_SampleView(sc_ShadowTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ShadowTextureLayout==2)
    }
    #else // #if (1)
    {
        #if (sc_CanUseTextureLod)
        {
            highp vec2 param_10 = uv;
            highp float param_11 = bias;
            return sc_ShadowTextureSampleLevel(param_10, param_11);
        }
        #else // #if (sc_CanUseTextureLod)
        {
            return vec4(0.0);
        }
        #endif // #else // #if (sc_CanUseTextureLod)
    }
    #endif // #else // #if (1)
}

highp vec4 sc_ShadowTextureSampleViewIndexLevel(highp vec2 uv, int viewIndex, highp float level)
{
    #if (sc_CanUseTextureLod)
    {
        #if (sc_ShadowTextureLayout==2)
        {
            highp vec2 param = sc_ShadowTextureGetDims2D();
            highp vec2 param_1 = uv;
            int param_2 = sc_ShadowTextureLayout;
            int param_3 = viewIndex;
            highp float param_4 = level;
            return sc_SampleViewLevel(sc_ShadowTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ShadowTextureLayout==2)
        {
            highp vec2 param_5 = sc_ShadowTextureGetDims2D();
            highp vec2 param_6 = uv;
            int param_7 = sc_ShadowTextureLayout;
            int param_8 = viewIndex;
            highp float param_9 = level;
            return sc_SampleViewLevel(sc_ShadowTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ShadowTextureLayout==2)
    }
    #else // #if (sc_CanUseTextureLod)
    {
        return vec4(0.0);
    }
    #endif // #else // #if (sc_CanUseTextureLod)
}

highp vec4 sc_ShadowTextureSampleViewLevel(highp vec2 uv, highp float level)
{
    highp vec2 param = uv;
    int param_1 = sc_ShadowTextureGetStereoViewIndex();
    highp float param_2 = level;
    return sc_ShadowTextureSampleViewIndexLevel(param, param_1, param_2);
}

highp vec4 sc_ShadowTextureSampleViewIndexBias(highp vec2 uv, int viewIndex, highp float bias)
{
    #if (1)
    {
        #if (sc_ShadowTextureLayout==2)
        {
            highp vec2 param = sc_ShadowTextureGetDims2D();
            highp vec2 param_1 = uv;
            int param_2 = sc_ShadowTextureLayout;
            int param_3 = viewIndex;
            highp float param_4 = bias;
            return sc_SampleView(sc_ShadowTextureArrSC, param, param_1, param_2, param_3, param_4);
        }
        #else // #if (sc_ShadowTextureLayout==2)
        {
            highp vec2 param_5 = sc_ShadowTextureGetDims2D();
            highp vec2 param_6 = uv;
            int param_7 = sc_ShadowTextureLayout;
            int param_8 = viewIndex;
            highp float param_9 = bias;
            return sc_SampleView(sc_ShadowTexture, param_5, param_6, param_7, param_8, param_9);
        }
        #endif // #else // #if (sc_ShadowTextureLayout==2)
    }
    #else // #if (1)
    {
        #if (sc_CanUseTextureLod)
        {
            highp vec2 param_10 = uv;
            int param_11 = viewIndex;
            highp float param_12 = bias;
            return sc_ShadowTextureSampleViewIndexLevel(param_10, param_11, param_12);
        }
        #else // #if (sc_CanUseTextureLod)
        {
            return vec4(0.0);
        }
        #endif // #else // #if (sc_CanUseTextureLod)
    }
    #endif // #else // #if (1)
}

highp vec4 sc_ShadowTextureSampleViewBias(highp vec2 uv, highp float bias)
{
    highp vec2 param = uv;
    int param_1 = sc_ShadowTextureGetStereoViewIndex();
    highp float param_2 = bias;
    return sc_ShadowTextureSampleViewIndexBias(param, param_1, param_2);
}

highp vec4 sc_ShadowTextureSampleViewIndex(highp vec2 uv, int viewIndex)
{
    highp vec2 param = uv;
    int param_1 = viewIndex;
    highp float param_2 = 0.0;
    return sc_ShadowTextureSampleViewIndexBias(param, param_1, param_2);
}

highp vec4 sc_ShadowTextureSampleView(highp vec2 uv)
{
    highp vec2 param = uv;
    int param_1 = sc_ShadowTextureGetStereoViewIndex();
    return sc_ShadowTextureSampleViewIndex(param, param_1);
}

highp float getShadowAlpha(highp vec4 color)
{
    highp float shadowAlpha = 1.0;
    #if ((sc_BlendMode_Normal||sc_BlendMode_AlphaToCoverage)||sc_BlendMode_PremultipliedAlphaHardware)
    {
        shadowAlpha = color.w;
    }
    #else // #if ((sc_BlendMode_Normal||sc_BlendMode_AlphaToCoverage)||sc_BlendMode_PremultipliedAlphaHardware)
    {
        #if (sc_BlendMode_PremultipliedAlpha)
        {
            shadowAlpha = clamp(color.w * 2.0, 0.0, 1.0);
        }
        #else // #if (sc_BlendMode_PremultipliedAlpha)
        {
            #if (sc_BlendMode_AddWithAlphaFactor)
            {
                shadowAlpha = clamp(dot(color.xyz, vec3(color.w)), 0.0, 1.0);
            }
            #else // #if (sc_BlendMode_AddWithAlphaFactor)
            {
                #if (sc_BlendMode_AlphaTest)
                {
                    shadowAlpha = 1.0;
                }
                #else // #if (sc_BlendMode_AlphaTest)
                {
                    #if (sc_BlendMode_Multiply)
                    {
                        shadowAlpha = (1.0 - dot(color.xyz, vec3(0.33333))) * color.w;
                    }
                    #else // #if (sc_BlendMode_Multiply)
                    {
                        #if (sc_BlendMode_MultiplyOriginal)
                        {
                            shadowAlpha = (1.0 - clamp(dot(color.xyz, vec3(1.0)), 0.0, 1.0)) * color.w;
                        }
                        #else // #if (sc_BlendMode_MultiplyOriginal)
                        {
                            #if (sc_BlendMode_ColoredGlass)
                            {
                                shadowAlpha = clamp(dot(color.xyz, vec3(1.0)), 0.0, 1.0) * color.w;
                            }
                            #else // #if (sc_BlendMode_ColoredGlass)
                            {
                                #if (sc_BlendMode_Add)
                                {
                                    shadowAlpha = clamp(dot(color.xyz, vec3(1.0)), 0.0, 1.0);
                                }
                                #else // #if (sc_BlendMode_Add)
                                {
                                    #if (sc_BlendMode_AddWithAlphaFactor)
                                    {
                                        shadowAlpha = clamp(dot(color.xyz, vec3(1.0)), 0.0, 1.0) * color.w;
                                    }
                                    #else // #if (sc_BlendMode_AddWithAlphaFactor)
                                    {
                                        #if (sc_BlendMode_Screen)
                                        {
                                            shadowAlpha = dot(color.xyz, vec3(0.33333)) * color.w;
                                        }
                                        #else // #if (sc_BlendMode_Screen)
                                        {
                                            #if (sc_BlendMode_Min)
                                            {
                                                shadowAlpha = 1.0 - clamp(dot(color.xyz, vec3(1.0)), 0.0, 1.0);
                                            }
                                            #else // #if (sc_BlendMode_Min)
                                            {
                                                #if (sc_BlendMode_Max)
                                                {
                                                    shadowAlpha = clamp(dot(color.xyz, vec3(1.0)), 0.0, 1.0);
                                                }
                                                #endif // #if (sc_BlendMode_Max)
                                            }
                                            #endif // #else // #if (sc_BlendMode_Min)
                                        }
                                        #endif // #else // #if (sc_BlendMode_Screen)
                                    }
                                    #endif // #else // #if (sc_BlendMode_AddWithAlphaFactor)
                                }
                                #endif // #else // #if (sc_BlendMode_Add)
                            }
                            #endif // #else // #if (sc_BlendMode_ColoredGlass)
                        }
                        #endif // #else // #if (sc_BlendMode_MultiplyOriginal)
                    }
                    #endif // #else // #if (sc_BlendMode_Multiply)
                }
                #endif // #else // #if (sc_BlendMode_AlphaTest)
            }
            #endif // #else // #if (sc_BlendMode_AddWithAlphaFactor)
        }
        #endif // #else // #if (sc_BlendMode_PremultipliedAlpha)
    }
    #endif // #else // #if ((sc_BlendMode_Normal||sc_BlendMode_AlphaToCoverage)||sc_BlendMode_PremultipliedAlphaHardware)
    return shadowAlpha;
}

highp vec4 evaluateShadowCasterColor(highp vec4 shadowCasterColor)
{
    highp vec4 param = shadowCasterColor;
    highp float alpha = getShadowAlpha(param);
    highp float shadowTerm = sc_ShadowDensity * alpha;
    highp vec3 shadowColor = mix(sc_ShadowColor.xyz, sc_ShadowColor.xyz * shadowCasterColor.xyz, vec3(sc_ShadowColor.w));
    return vec4(shadowColor.x, shadowColor.y, shadowColor.z, shadowTerm);
}

highp float getShadowTexClipFactor()
{
    highp vec2 uv = abs(varShadowTex - vec2(0.5));
    highp float clipFactor = max(uv.x, uv.y);
    return step(clipFactor, 0.5);
}

highp vec3 evaluateShadow()
{
    highp vec2 param = varShadowTex;
    highp vec4 shadowSample = sc_ShadowTextureSampleView(param) * getShadowTexClipFactor();
    highp vec3 shadowColor = mix(sc_ShadowColor.xyz, sc_ShadowColor.xyz * shadowSample.xyz, vec3(sc_ShadowColor.w));
    highp float shadowDensity = shadowSample.w * sc_ShadowDensity;
    return mix(vec3(1.0), shadowColor, vec3(shadowDensity));
}

#endif // #elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
