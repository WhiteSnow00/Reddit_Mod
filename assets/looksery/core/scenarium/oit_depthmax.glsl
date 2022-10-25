//-----------------------------------------------------------------------
// Copyright (c) 2020 Snap Inc.
//-----------------------------------------------------------------------
#define SC_USE_USER_DEFINED_VS_MAIN

#include <required.glsl>

// This OIT shader is used to perform a pass over the depth bounds render target
// with the min/max depth values of transparent objects in the scene, and reduce it down
// to a smaller 128x128 texture.

varying vec2 varTexCoords;

#ifdef VERTEX_SHADER
attribute vec2 position;

void main(void) {
    varTexCoords = position * 0.5 + 0.5;
    gl_Position = vec4(position, 0.0, 1.0);
}
#endif // VERTEX_SHADER

#ifdef FRAGMENT_SHADER

uniform sampler2D sc_OITDepthBoundsTexture;
#define sc_DepthBoundsTextureSize 128.0

vec2 sampleDepthBounds(vec2 depthBounds, vec2 screenUV, vec2 offset) {
    vec2 oitDepthSample = texture2D(sc_OITDepthBoundsTexture, screenUV + offset / sc_DepthBoundsTextureSize).xy;
    // the depth bounds texture is encoded as (1.0 - min, max). 
    // Taking the max of both values will return the min & max.
    depthBounds = vec2(max(depthBounds.x, oitDepthSample.x), max(depthBounds.y, oitDepthSample.y));
    return depthBounds;
}

// For the depth bounds estimation we are using a render target that is lower resolution than the final ouput
// when rendering the final pass and sampling the depth bounds, we end up texels around the edges of objects
// where the depth bounds are too aggressive due to aliasing.
// To counter this, the depth bounds are made more conservative by sampling the neighboring texels.
void main() {
    vec2 depthBounds = vec2(0.0);
    depthBounds = sampleDepthBounds(depthBounds, varTexCoords, vec2(0.0, 0.0));
    depthBounds = sampleDepthBounds(depthBounds, varTexCoords, vec2(-1.0, 0.0));
    depthBounds = sampleDepthBounds(depthBounds, varTexCoords, vec2(1.0, 0.0));
    depthBounds = sampleDepthBounds(depthBounds, varTexCoords, vec2(0.0, -1.0));
    depthBounds = sampleDepthBounds(depthBounds, varTexCoords, vec2(0.0, 1.0));
    sc_FragData0 = vec4(depthBounds.x, depthBounds.y, 0.0, 0.0);
}

#endif // FRAGMENT_SHADER
