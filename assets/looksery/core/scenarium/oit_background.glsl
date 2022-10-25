//-----------------------------------------------------------------------
// Copyright (c) 2020 Snap Inc.
//-----------------------------------------------------------------------
#define SC_USE_USER_DEFINED_VS_MAIN

#include <required.glsl>

// This an OIT shader. It's intended to be used with a multiply blend operator, with the 
// purpose of darkening the background by the proper factor prior to additively blending
// the transparent layers on top.

varying vec2 varTexCoords;

#ifdef VERTEX_SHADER
attribute vec2 position;

void main(void) {
    varTexCoords = position * 0.5 + 0.5;
    gl_Position = vec4(position, 0.0, 1.0);
}
#endif // VERTEX_SHADER

#ifdef FRAGMENT_SHADER

uniform sampler2D sc_OITAlpha0;

#if defined(sc_OITMaxLayers8)
#define OitDepthGatherPassCount 2
uniform sampler2D sc_OITAlpha1;
#else
#define OitDepthGatherPassCount 1
#endif

#define DepthsPerGatherPass 4
#define MaxDepths (OitDepthGatherPassCount * DepthsPerGatherPass)

void unpackValues(float channel, int passIndex, inout int values[MaxDepths]) {
    channel = floor(channel * 255.0 + 0.5);
    // least recent depth is in the lower order bits.
    for (int i = (passIndex + 1) * DepthsPerGatherPass - 1; i >= (passIndex * DepthsPerGatherPass); --i) {
        values[i] = values[i] * 4 + int(floor(mod(channel, 4.0)));
        channel = floor(channel / 4.0);
    }
}

void main() {
    #if defined(sc_OITMaxLayersVisualizeLayerCount)
        vec4 alphaSample = texture2D(sc_OITAlpha0, varTexCoords); 
        if (alphaSample.r == 0.0) {
            sc_FragData0 = vec4(0.0, 0.0, 0.0, 1.0);
        } else if (alphaSample.r <= 4.0 / 255.0) {
            sc_FragData0 = vec4(0.0, 1.0, 0.0, 1.0);
        } else if (alphaSample.r <= 8.0 / 255.0) {
            sc_FragData0 = vec4(1.0, 1.0, 0.0, 1.0);
        } else {
            sc_FragData0 = vec4(1.0, 0.0, 0.0, 1.0);
        }
        return;
    #endif

    int alphas[MaxDepths];
    for (int i = 0; i < MaxDepths; ++i) {
        alphas[i] = 0;
    }
    for (int pass = 0; pass < OitDepthGatherPassCount; ++pass) {
        // unpack high order bits first, in the reverse order they were packed.
        vec4 alphaSample;
        if (pass == 0) {
            alphaSample = texture2D(sc_OITAlpha0, varTexCoords);
        } 
#if defined(sc_OITMaxLayers8)
        else if (pass == 1) {
            alphaSample = texture2D(sc_OITAlpha1, varTexCoords);
        }
#endif
        unpackValues(alphaSample.a, pass, alphas);
        unpackValues(alphaSample.b, pass, alphas);
        unpackValues(alphaSample.g, pass, alphas);
        unpackValues(alphaSample.r, pass, alphas);
    }

    float alphas_normalized[MaxDepths];
    for (int i = 0; i < MaxDepths; ++i) {
        alphas_normalized[i] = float(alphas[i]) / 255.0;
    }
    
    // the background alpha is not dependent on the order of the layers in front of it.
    float backgroundAlpha = 1.0;
    for (int i = 0; i < MaxDepths; ++i) {
        backgroundAlpha = (1.0 - alphas_normalized[i]) * backgroundAlpha;
    }

    sc_FragData0 = vec4(backgroundAlpha, backgroundAlpha, backgroundAlpha, 1.0);
}

#endif // FRAGMENT_SHADER