#pragma once
#if defined VERTEX_SHADER
#include <required2.glsl>


varying float varStereoViewID;

int sc_GetStereoViewIndex()
{
    #if (sc_StereoRenderingMode==0)
    {
        return 0;
    }
    #else // #if (sc_StereoRenderingMode==0)
    {
        return sc_StereoViewID;
    }
    #endif // #else // #if (sc_StereoRenderingMode==0)
}

#elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
#include <required2.glsl>


varying highp float varStereoViewID;

int sc_GetStereoViewIndex()
{
    #if (sc_StereoRenderingMode==0)
    {
        return 0;
    }
    #else // #if (sc_StereoRenderingMode==0)
    {
        return int(varStereoViewID);
    }
    #endif // #else // #if (sc_StereoRenderingMode==0)
}

#endif // #elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
