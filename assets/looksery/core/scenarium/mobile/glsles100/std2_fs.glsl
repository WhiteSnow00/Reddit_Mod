#pragma once
#if defined VERTEX_SHADER
#include <std2.glsl>

#ifndef sc_GetFramebufferColorInvalidUsageMarker
#define sc_GetFramebufferColorInvalidUsageMarker 0
#elif sc_GetFramebufferColorInvalidUsageMarker == 1
#undef sc_GetFramebufferColorInvalidUsageMarker
#define sc_GetFramebufferColorInvalidUsageMarker 1
#endif



#elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
    #if sc_StereoRenderingMode == sc_StereoRendering_InstancedClipped && !sc_StereoRendering_IsClipDistanceEnabled
        // Our "main" should be invoked for instanced-clipped when gl_ClipDistance is not available.
        #define sc_StereoFragmentMain main
        #define sc_MainInjector MAIN(); void sc_MainInjected
    #else
        // Make sure MAIN is implemented, keep compilers happy.
        #define MAIN sc_MainInjector
    #endif

#include <std2.glsl>

#ifndef sc_GetFramebufferColorInvalidUsageMarker
#define sc_GetFramebufferColorInvalidUsageMarker 0
#elif sc_GetFramebufferColorInvalidUsageMarker == 1
#undef sc_GetFramebufferColorInvalidUsageMarker
#define sc_GetFramebufferColorInvalidUsageMarker 1
#endif
uniform highp float _sc_GetFramebufferColorInvalidUsageMarker;
uniform highp float shaderComplexityValue;


highp vec2 sc_GetGlobalScreenCoords()
{
    return (gl_FragCoord.xy * sc_WindowToViewportTransform.xy) + sc_WindowToViewportTransform.zw;
}

highp vec2 sc_GetViewScreenCoords()
{
    highp vec2 param = sc_GetGlobalScreenCoords();
    return sc_ScreenCoordsGlobalToView(param);
}

highp vec2 getScreenUV()
{
    return sc_GetViewScreenCoords();
}

highp vec4 sc_GetFramebufferColor()
{
    highp vec4 result;
    #if (sc_FramebufferFetch)
    {
        result = sc_readFragData0();
    }
    #else // #if (sc_FramebufferFetch)
    {
        highp vec2 param = sc_GetViewScreenCoords();
        result = sc_ScreenTextureSampleView(param);
    }
    #endif // #else // #if (sc_FramebufferFetch)
    #if (((sc_IsEditor&&sc_GetFramebufferColorInvalidUsageMarker)&&(!sc_BlendMode_Software))&&(!sc_BlendMode_ColoredGlass))
    {
        result.x += _sc_GetFramebufferColorInvalidUsageMarker;
    }
    #endif // #if (((sc_IsEditor&&sc_GetFramebufferColorInvalidUsageMarker)&&(!sc_BlendMode_Software))&&(!sc_BlendMode_ColoredGlass))
    return result;
}

highp vec4 getFramebufferColor()
{
    return sc_GetFramebufferColor();
}

highp vec4 sc_ApplyBlendModeModifications(highp vec4 color)
{
    #if (sc_BlendMode_MultiplyOriginal)
    {
        return vec4(mix(vec3(1.0), color.xyz, vec3(color.w)), color.w);
    }
    #else // #if (sc_BlendMode_MultiplyOriginal)
    {
        #if (sc_BlendMode_Screen||sc_BlendMode_PremultipliedAlphaHardware)
        {
            return vec4(color.xyz * color.w, color.w);
        }
        #else // #if (sc_BlendMode_Screen||sc_BlendMode_PremultipliedAlphaHardware)
        {
            return color;
        }
        #endif // #else // #if (sc_BlendMode_Screen||sc_BlendMode_PremultipliedAlphaHardware)
    }
    #endif // #else // #if (sc_BlendMode_MultiplyOriginal)
}

void sc_DiscardStereoFragment()
{
    #if ((sc_StereoRenderingMode==1)&&(sc_StereoRendering_IsClipDistanceEnabled==1))
    {
        if (varClipDistance < 0.0)
        {
            discard;
        }
    }
    #endif // #if ((sc_StereoRenderingMode==1)&&(sc_StereoRendering_IsClipDistanceEnabled==1))
}

highp vec4 getPixelRenderingCost()
{
    #if (sc_ShaderComplexityAnalyzer)
    {
        return vec4(shaderComplexityValue / 255.0, 0.0, 0.0, 1.0);
    }
    #else // #if (sc_ShaderComplexityAnalyzer)
    {
        return vec4(0.0);
    }
    #endif // #else // #if (sc_ShaderComplexityAnalyzer)
}

void sc_MainInjector()
{
}

void sc_CallLensFragmentMain()
{
    #if sc_StereoRenderingMode == sc_StereoRendering_InstancedClipped && !sc_StereoRendering_IsClipDistanceEnabled
        MAIN();
    #endif

}

void sc_StereoFragmentMain()
{
    sc_DiscardStereoFragment();
    sc_CallLensFragmentMain();
}

#endif // #elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
