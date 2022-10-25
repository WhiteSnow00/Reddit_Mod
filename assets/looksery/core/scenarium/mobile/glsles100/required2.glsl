#pragma once
#if defined VERTEX_SHADER
#include <required2_gl.glsl>

#ifndef sc_CanUseSampler2DArray
#define sc_CanUseSampler2DArray 0
#elif sc_CanUseSampler2DArray == 1
#undef sc_CanUseSampler2DArray
#define sc_CanUseSampler2DArray 1
#endif
#ifndef sc_CanUseTextureLod
#define sc_CanUseTextureLod 0
#elif sc_CanUseTextureLod == 1
#undef sc_CanUseTextureLod
#define sc_CanUseTextureLod 1
#endif
#ifndef sc_CanUseStandardDerivatives
#define sc_CanUseStandardDerivatives 0
#elif sc_CanUseStandardDerivatives == 1
#undef sc_CanUseStandardDerivatives
#define sc_CanUseStandardDerivatives 1
#endif
#ifndef sc_StereoRenderingMode
#define sc_StereoRenderingMode 0
#endif
#ifndef sc_NumStereoViews
#define sc_NumStereoViews 1
#endif
#ifndef sc_StereoViewID
#define sc_StereoViewID 0
#endif
#ifndef sc_FragDataCount
#define sc_FragDataCount 0
#endif

uniform int sc_FallbackInstanceID;

int sc_GetLocalInstanceID()
{
#ifdef sc_LocalInstanceID
    return sc_LocalInstanceID;
#else
    return 0;
#endif

}

#elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
#include <required2_gl.glsl>

#ifndef sc_UseFramebufferFetchMarker
#define sc_UseFramebufferFetchMarker 0
#elif sc_UseFramebufferFetchMarker == 1
#undef sc_UseFramebufferFetchMarker
#define sc_UseFramebufferFetchMarker 1
#endif
#ifndef sc_CanUseSampler2DArray
#define sc_CanUseSampler2DArray 0
#elif sc_CanUseSampler2DArray == 1
#undef sc_CanUseSampler2DArray
#define sc_CanUseSampler2DArray 1
#endif
#ifndef sc_CanUseTextureLod
#define sc_CanUseTextureLod 0
#elif sc_CanUseTextureLod == 1
#undef sc_CanUseTextureLod
#define sc_CanUseTextureLod 1
#endif
#ifndef sc_CanUseStandardDerivatives
#define sc_CanUseStandardDerivatives 0
#elif sc_CanUseStandardDerivatives == 1
#undef sc_CanUseStandardDerivatives
#define sc_CanUseStandardDerivatives 1
#endif
#ifndef sc_StereoRenderingMode
#define sc_StereoRenderingMode 0
#endif
#ifndef sc_NumStereoViews
#define sc_NumStereoViews 1
#endif
#ifndef sc_StereoViewID
#define sc_StereoViewID 0
#endif
#ifndef sc_FragDataCount
#define sc_FragDataCount 0
#endif

uniform highp float _sc_framebufferFetchMarker;

void sc_writeFragData0(highp vec4 col)
{
    sc_FragData0 = col;

}

void sc_writeFragData1(highp vec4 col)
{
#if sc_FragDataCount > 1
    sc_FragData1 = col;
#endif

}

void sc_writeFragData2(highp vec4 col)
{
#if sc_FragDataCount > 2
    sc_FragData2 = col;
#endif

}

void sc_writeFragData3(highp vec4 col)
{
#if sc_FragDataCount > 3
    sc_FragData3 = col;
#endif

}

highp vec4 sc_readFragData0_Platform()
{
    return getFragData()[0];

}

highp vec4 sc_readFragData1_Platform()
{
    return getFragData()[1];

}

highp vec4 sc_readFragData2_Platform()
{
    return getFragData()[2];

}

highp vec4 sc_readFragData3_Platform()
{
    return getFragData()[3];

}

highp vec4 sc_readFragData0()
{
    highp vec4 result = sc_readFragData0_Platform();
    #if (sc_UseFramebufferFetchMarker)
    {
        result.x += _sc_framebufferFetchMarker;
    }
    #endif // #if (sc_UseFramebufferFetchMarker)
    return result;
}

highp vec4 sc_readFragData1()
{
    highp vec4 result = sc_readFragData1_Platform();
    #if (sc_UseFramebufferFetchMarker)
    {
        result.x += _sc_framebufferFetchMarker;
    }
    #endif // #if (sc_UseFramebufferFetchMarker)
    return result;
}

highp vec4 sc_readFragData2()
{
    highp vec4 result = sc_readFragData2_Platform();
    #if (sc_UseFramebufferFetchMarker)
    {
        result.x += _sc_framebufferFetchMarker;
    }
    #endif // #if (sc_UseFramebufferFetchMarker)
    return result;
}

highp vec4 sc_readFragData3()
{
    highp vec4 result = sc_readFragData3_Platform();
    #if (sc_UseFramebufferFetchMarker)
    {
        result.x += _sc_framebufferFetchMarker;
    }
    #endif // #if (sc_UseFramebufferFetchMarker)
    return result;
}

#endif // #elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
