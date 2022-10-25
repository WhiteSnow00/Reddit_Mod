//-----------------------------------------------------------------------
// Copyright (c) 2017 Snap Inc.
//-----------------------------------------------------------------------

#ifdef FRAGMENT_SHADER
#ifdef SC_TEXTURE_EXTERNAL
#extension GL_OES_EGL_image_external : require
#endif // #ifdef SC_TEXTURE_EXTERNAL
#endif // #ifdef FRAGMENT_SHADER

#define SC_USE_USER_DEFINED_VS_MAIN
#define STD_DISABLE_VERTEX_NORMAL
#define STD_DISABLE_VERTEX_TANGENT
#define STD_DISABLE_VERTEX_TEXTURE1

#include <std_vs.glsl>
#include <std_fs.glsl>

// This uniform will only be set if "screenTexture" is set.
// Make sure "screenTexture" is not optimized out before using this transform.
uniform mat3 screenTextureTransform;

#ifdef USE_MESH_TRANSFORM
uniform mat3 meshTransform;
#endif // #ifdef USE_MESH_TRANSFORM

#ifdef USE_MIP_BIAS
uniform float screenTextureBias;
#else
#define USE_MIP_BIAS 0
#define screenTextureBias 0.0
#endif

#ifdef VERTEX_SHADER

void main(void) {
    sc_Vertex_t v = sc_LoadVertexAttributes();

    #ifdef ONLY_VERTEX_ATTRIBUTE
    vec2 texture0 = (v.position.xy + vec2(1.0)) * 0.5;
    #else // #ifdef ONLY_VERTEX_ATTRIBUTE
    vec2 texture0 = v.texture0.xy;
    #endif // #else // #ifdef ONLY_VERTEX_ATTRIBUTE

    v.texture0.xy = vec2(screenTextureTransform * vec3(texture0, 1.0));

    #ifdef USE_MESH_TRANSFORM
    v.position.xy = vec2(meshTransform * vec3(position.xy, 1.0));
    #endif // #ifdef USE_MESH_TRANSFORM

    sc_ProcessVertex(v);
}

#endif // #ifdef VERTEX_SHADER

#ifdef FRAGMENT_SHADER

#ifdef SC_TEXTURE_EXTERNAL
SC_DECLARE_TEXTURE_SAMPLER_TYPE(screenTexture, samplerExternalOES)
#endif // #ifdef SC_TEXTURE_EXTERNAL

SC_DECLARE_TEXTURE_SAMPLER(screenTexture)

void main(void) {

#ifdef SC_TEXTURE_EXTERNAL

    //
    // JavaExternalTextureStream uses external samplers:
    // https://www.khronos.org/registry/OpenGL/extensions/OES/OES_EGL_image_external.txt
    //

    vec4 screenTextureColor = texture2D(screenTexture, varTex0);

#else // #ifdef SC_TEXTURE_EXTERNAL

    // NOTE SC_TEXTURE2DLOD_IS_SIMULATED is defined in "std_texture.glsl" when mip level sampling simulation is enabled.
    #if defined(SC_TEXTURE2DLOD_IS_SIMULATED) && !USE_MIP_BIAS

        //
        // This scope handles legacy use cases of "screentexture.glsl" and legacy devices.
        // "sc_textureExternalOESLod" simulates mip level sampling via bias when needed,
        // but since it's still a function, it will require all passed uniforms to be active and uploaded
        // even when they are not used and the simulation scope is not active.
        //

        vec4 screenTextureColor = sc_textureExternalOESLod(screenTexture, screenTextureSize.xy, varTex0, screenTextureLevel);

    #else // #if defined(SC_TEXTURE2DLOD_IS_SIMULATED) && !USE_MIP_BIAS

        //
        // We can render in stereo mode or/and use stereo samplers,
        // only per-texture generated functions should be used in these cases.
        //

        #if USE_MIP_BIAS || !defined(sc_CanUseTextureLod)
            vec4 screenTextureColor = screenTextureSampleViewBias(varTex0, screenTextureBias);
        #else // #if USE_MIP_BIAS || !defined(sc_CanUseTextureLod)
            vec4 screenTextureColor = screenTextureSampleViewLevel(varTex0, screenTextureLevel);
        #endif // #else // #if USE_MIP_BIAS || !defined(sc_CanUseTextureLod)

    #endif // #else // #if defined(SC_TEXTURE2DLOD_IS_SIMULATED) && !USE_MIP_BIAS

#endif // #else // #ifdef SC_TEXTURE_EXTERNAL

#ifdef SWAP_R_B_CHANNELS
    gl_FragColor = screenTextureColor.bgra;
#elif defined(GRAYSCALE_AS_ALPHA)
    gl_FragColor = vec4(1.0, 1.0, 1.0, screenTextureColor.r);
#else
    gl_FragColor = screenTextureColor;
#endif

}

#endif // #ifdef FRAGMENT_SHADER
