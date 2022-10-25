#pragma once
#if defined VERTEX_SHADER
#if __VERSION__ == 100
    #define sampler2DArray vec2
    #define sampler3D vec3
    vec4 texture2D(vec2 s, vec3 uv) { return vec4(0.0); }
    vec4 texture2D(vec3 s, vec3 uv) { return vec4(0.0); }
    #ifdef FRAGMENT_SHADER
        #define texture2DArray(SAMPLER, UV) vec4(0.0)
        #define texture3D(SAMPLER, UV) vec4(0.0)
    #endif
#elif __VERSION__ >= 300
    #define texture2DArray texture
    #define texture3D texture
    #define textureCube texture
#endif
#if __VERSION__ < 300 && defined(VERTEX_SHADER)
    // SPIRV-Cross outputs texture2D calls in VS for #version 100 es, which doesn't work.
    #define texture2D(SAMPLER, UV) sc_textureLod(SAMPLER, UV, 0.0)
    #define texture2DArray(SAMPLER, UV) sc_textureLod(SAMPLER, UV, 0.0)
    #define texture3D(SAMPLER, UV) sc_textureLod(SAMPLER, UV, 0.0)
    #define textureCube(SAMPLER, UV) sc_textureLod(SAMPLER, UV, 0.0)
#endif


#elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
#if __VERSION__ == 100
    #define sampler2DArray vec2
    #define sampler3D vec3
    vec4 texture2D(vec2 s, vec3 uv) { return vec4(0.0); }
    vec4 texture2D(vec3 s, vec3 uv) { return vec4(0.0); }
    #ifdef FRAGMENT_SHADER
        #define texture2DArray(SAMPLER, UV) vec4(0.0)
        #define texture3D(SAMPLER, UV) vec4(0.0)
    #endif
#elif __VERSION__ >= 300
    #define texture2DArray texture
    #define texture3D texture
    #define textureCube texture
#endif
#if __VERSION__ < 300 && defined(VERTEX_SHADER)
    // SPIRV-Cross outputs texture2D calls in VS for #version 100 es, which doesn't work.
    #define texture2D(SAMPLER, UV) sc_textureLod(SAMPLER, UV, 0.0)
    #define texture2DArray(SAMPLER, UV) sc_textureLod(SAMPLER, UV, 0.0)
    #define texture3D(SAMPLER, UV) sc_textureLod(SAMPLER, UV, 0.0)
    #define textureCube(SAMPLER, UV) sc_textureLod(SAMPLER, UV, 0.0)
#endif


#endif // #elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
