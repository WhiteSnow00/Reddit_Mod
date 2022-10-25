#pragma once
#if defined VERTEX_SHADER
#include <std2_shadows.glsl>

struct sc_Vertex_t
{
    vec4 position;
    vec3 normal;
    vec3 tangent;
    vec2 texture0;
    vec2 texture1;
};

#ifndef sc_SkinBonesCount
#define sc_SkinBonesCount 0
#endif
#ifndef STD_DISABLE_VERTEX_NORMAL
#define STD_DISABLE_VERTEX_NORMAL 0
#elif STD_DISABLE_VERTEX_NORMAL == 1
#undef STD_DISABLE_VERTEX_NORMAL
#define STD_DISABLE_VERTEX_NORMAL 1
#endif
#ifndef STD_DISABLE_VERTEX_TANGENT
#define STD_DISABLE_VERTEX_TANGENT 0
#elif STD_DISABLE_VERTEX_TANGENT == 1
#undef STD_DISABLE_VERTEX_TANGENT
#define STD_DISABLE_VERTEX_TANGENT 1
#endif
#ifndef sc_VertexBlending
#define sc_VertexBlending 0
#elif sc_VertexBlending == 1
#undef sc_VertexBlending
#define sc_VertexBlending 1
#endif
#ifndef sc_VertexBlendingUseNormals
#define sc_VertexBlendingUseNormals 0
#elif sc_VertexBlendingUseNormals == 1
#undef sc_VertexBlendingUseNormals
#define sc_VertexBlendingUseNormals 1
#endif
#ifndef SC_DISABLE_FRUSTUM_CULLING
#define SC_DISABLE_FRUSTUM_CULLING 0
#elif SC_DISABLE_FRUSTUM_CULLING == 1
#undef SC_DISABLE_FRUSTUM_CULLING
#define SC_DISABLE_FRUSTUM_CULLING 1
#endif
#ifndef STD_DISABLE_VERTEX_TEXTURE0
#define STD_DISABLE_VERTEX_TEXTURE0 0
#elif STD_DISABLE_VERTEX_TEXTURE0 == 1
#undef STD_DISABLE_VERTEX_TEXTURE0
#define STD_DISABLE_VERTEX_TEXTURE0 1
#endif
#ifndef STD_DISABLE_VERTEX_TEXTURE1
#define STD_DISABLE_VERTEX_TEXTURE1 0
#elif STD_DISABLE_VERTEX_TEXTURE1 == 1
#undef STD_DISABLE_VERTEX_TEXTURE1
#define STD_DISABLE_VERTEX_TEXTURE1 1
#endif
#ifndef sc_DepthBufferMode
#define sc_DepthBufferMode 0
#endif
#ifndef sc_TAAEnabled
#define sc_TAAEnabled 0
#elif sc_TAAEnabled == 1
#undef sc_TAAEnabled
#define sc_TAAEnabled 1
#endif
uniform vec4 sc_StereoClipPlanes[sc_NumStereoViews];
uniform vec4 sc_BoneMatrices[(sc_SkinBonesCount * 3) + 1];
uniform mat3 sc_SkinBonesNormalMatrices[sc_SkinBonesCount + 1];
uniform vec4 weights0;
uniform vec4 weights1;
uniform float sc_DisableFrustumCullingMarker;
uniform vec2 sc_TAAJitterOffset;
uniform vec4 weights2;

attribute vec4 boneData;
attribute vec3 blendShape0Pos;
attribute vec3 blendShape0Normal;
attribute vec3 blendShape1Pos;
attribute vec3 blendShape1Normal;
attribute vec3 blendShape2Pos;
attribute vec3 blendShape2Normal;
attribute vec3 blendShape3Pos;
attribute vec3 blendShape4Pos;
attribute vec3 blendShape5Pos;
attribute vec4 position;
attribute vec3 normal;
attribute vec4 tangent;
attribute vec2 texture0;
attribute vec2 texture1;
varying vec3 varPos;
varying vec3 varNormal;
varying vec4 varTangent;
varying vec4 varPackedTex;
varying vec4 varScreenPos;
varying vec2 varScreenTexturePos;
varying float varViewSpaceDepth;

void sc_SetClipDistanceGL(float dstClipDistance)
{
    #if sc_StereoRenderingMode == sc_StereoRendering_InstancedClipped && sc_StereoRendering_IsClipDistanceEnabled
        gl_ClipDistance[0] = dstClipDistance;
    #endif

}

void sc_SetClipDistanceMTL(float dstClipDistance)
{
    // TODO(ggan,smarton)
    //      https://developer.apple.com/metal/Metal-Shading-Language-Specification.pdf
    //      Table 5.3. Attributes for vertex function return type
    //      clip_distance - float/float[n] - Distance from vertex to clipping plane.

}

void sc_SetClipDistance(float dstClipDistance)
{
    #if (sc_StereoRendering_IsClipDistanceEnabled==1)
    {
        float param = dstClipDistance;
        sc_SetClipDistanceGL(param);
    }
    #else // #if (sc_StereoRendering_IsClipDistanceEnabled==1)
    {
        varClipDistance = dstClipDistance;
    }
    #endif // #else // #if (sc_StereoRendering_IsClipDistanceEnabled==1)
}

void sc_SetClipDistance(vec4 clipPosition)
{
    #if (sc_StereoRenderingMode==1)
    {
        float dstClipDistance = dot(clipPosition, sc_StereoClipPlanes[sc_StereoViewID]);
        float param = dstClipDistance;
        sc_SetClipDistance(param);
    }
    #endif // #if (sc_StereoRenderingMode==1)
}

void sc_DummyOutPos()
{
    #ifdef VERTEX_SHADER
        // This overrides a default scOutPos implementation in required2_gl.glsl
        #undef scOutPos
        #define scOutPos sc_SetClipPosition
    #endif

}

void sc_SetClipPosition(vec4 clipPosition)
{
    #if (sc_StereoRenderingMode>0)
    {
        varStereoViewID = float(sc_StereoViewID);
    }
    #endif // #if (sc_StereoRenderingMode>0)
    vec4 param = clipPosition;
    sc_SetClipDistance(param);
    gl_Position = clipPosition;
}

vec3 skinVertexPosition(int i, vec4 v)
{
    #if (sc_SkinBonesCount>0)
    {
        int j = 3 * i;
        vec4 m0 = sc_BoneMatrices[j + 0];
        vec4 m1 = sc_BoneMatrices[j + 1];
        vec4 m2 = sc_BoneMatrices[j + 2];
        return vec3(dot(m0, v), dot(m1, v), dot(m2, v));
    }
    #else // #if (sc_SkinBonesCount>0)
    {
        return v.xyz;
    }
    #endif // #else // #if (sc_SkinBonesCount>0)
}

void sc_SkinVertex(inout sc_Vertex_t v)
{
    #if (sc_SkinBonesCount>0)
    {
        vec4 weights = vec4(1.0, fract(boneData.yzw));
        weights.x -= dot(weights.yzw, vec3(1.0));
        int index0 = int(boneData.x);
        int index1 = int(boneData.y);
        int index2 = int(boneData.z);
        int index3 = int(boneData.w);
        int param = index0;
        vec4 param_1 = v.position;
        int param_2 = index1;
        vec4 param_3 = v.position;
        int param_4 = index2;
        vec4 param_5 = v.position;
        int param_6 = index3;
        vec4 param_7 = v.position;
        vec3 _1249 = (((skinVertexPosition(param, param_1) * weights.x) + (skinVertexPosition(param_2, param_3) * weights.y)) + (skinVertexPosition(param_4, param_5) * weights.z)) + (skinVertexPosition(param_6, param_7) * weights.w);
        v.position = vec4(_1249.x, _1249.y, _1249.z, v.position.w);
        mat3 normalMatrix0;
        mat3 normalMatrix1;
        mat3 normalMatrix2;
        mat3 normalMatrix3;
        #if ((!STD_DISABLE_VERTEX_NORMAL)||(!STD_DISABLE_VERTEX_TANGENT))
        {
            normalMatrix0 = sc_SkinBonesNormalMatrices[index0];
            normalMatrix1 = sc_SkinBonesNormalMatrices[index1];
            normalMatrix2 = sc_SkinBonesNormalMatrices[index2];
            normalMatrix3 = sc_SkinBonesNormalMatrices[index3];
        }
        #endif // #if ((!STD_DISABLE_VERTEX_NORMAL)||(!STD_DISABLE_VERTEX_TANGENT))
        #if (!STD_DISABLE_VERTEX_NORMAL)
        {
            v.normal = ((((normalMatrix0 * v.normal) * weights.x) + ((normalMatrix1 * v.normal) * weights.y)) + ((normalMatrix2 * v.normal) * weights.z)) + ((normalMatrix3 * v.normal) * weights.w);
        }
        #endif // #if (!STD_DISABLE_VERTEX_NORMAL)
        #if (!STD_DISABLE_VERTEX_TANGENT)
        {
            v.tangent = ((((normalMatrix0 * v.tangent) * weights.x) + ((normalMatrix1 * v.tangent) * weights.y)) + ((normalMatrix2 * v.tangent) * weights.z)) + ((normalMatrix3 * v.tangent) * weights.w);
        }
        #endif // #if (!STD_DISABLE_VERTEX_TANGENT)
    }
    #endif // #if (sc_SkinBonesCount>0)
}

void blendTargetShape(inout sc_Vertex_t v, vec3 position_1, float weight)
{
    vec3 _1357 = v.position.xyz + (position_1 * weight);
    v.position = vec4(_1357.x, _1357.y, _1357.z, v.position.w);
}

void blendTargetShapeWithNormal(inout sc_Vertex_t v, vec3 position_1, vec3 normal_1, float weight)
{
    sc_Vertex_t param = v;
    vec3 param_1 = position_1;
    float param_2 = weight;
    blendTargetShape(param, param_1, param_2);
    v = param;
    v.normal += (normal_1 * weight);
}

void sc_BlendVertex(inout sc_Vertex_t v)
{
    #if (sc_VertexBlending)
    {
        #if (sc_VertexBlendingUseNormals)
        {
            sc_Vertex_t param = v;
            vec3 param_1 = blendShape0Pos;
            vec3 param_2 = blendShape0Normal;
            float param_3 = weights0.x;
            blendTargetShapeWithNormal(param, param_1, param_2, param_3);
            v = param;
            sc_Vertex_t param_4 = v;
            vec3 param_5 = blendShape1Pos;
            vec3 param_6 = blendShape1Normal;
            float param_7 = weights0.y;
            blendTargetShapeWithNormal(param_4, param_5, param_6, param_7);
            v = param_4;
            sc_Vertex_t param_8 = v;
            vec3 param_9 = blendShape2Pos;
            vec3 param_10 = blendShape2Normal;
            float param_11 = weights0.z;
            blendTargetShapeWithNormal(param_8, param_9, param_10, param_11);
            v = param_8;
        }
        #else // #if (sc_VertexBlendingUseNormals)
        {
            sc_Vertex_t param_12 = v;
            vec3 param_13 = blendShape0Pos;
            float param_14 = weights0.x;
            blendTargetShape(param_12, param_13, param_14);
            v = param_12;
            sc_Vertex_t param_15 = v;
            vec3 param_16 = blendShape1Pos;
            float param_17 = weights0.y;
            blendTargetShape(param_15, param_16, param_17);
            v = param_15;
            sc_Vertex_t param_18 = v;
            vec3 param_19 = blendShape2Pos;
            float param_20 = weights0.z;
            blendTargetShape(param_18, param_19, param_20);
            v = param_18;
            sc_Vertex_t param_21 = v;
            vec3 param_22 = blendShape3Pos;
            float param_23 = weights0.w;
            blendTargetShape(param_21, param_22, param_23);
            v = param_21;
            sc_Vertex_t param_24 = v;
            vec3 param_25 = blendShape4Pos;
            float param_26 = weights1.x;
            blendTargetShape(param_24, param_25, param_26);
            v = param_24;
            sc_Vertex_t param_27 = v;
            vec3 param_28 = blendShape5Pos;
            float param_29 = weights1.y;
            blendTargetShape(param_27, param_28, param_29);
            v = param_27;
        }
        #endif // #else // #if (sc_VertexBlendingUseNormals)
    }
    #endif // #if (sc_VertexBlending)
}

vec4 sc_ApplyScreenSpaceInstancedClippedShift(inout vec4 screenPosition)
{
    #if (sc_StereoRenderingMode==1)
    {
        float viewIndex = float(sc_GetStereoViewIndex());
        screenPosition.y = (screenPosition.y * 0.5) + (0.5 - viewIndex);
    }
    #endif // #if (sc_StereoRenderingMode==1)
    return screenPosition;
}

vec4 sc_ObjectToScreen(inout vec4 objectPosition)
{
    #if (sc_RenderingSpace==3)
    {
        vec4 param = objectPosition;
        vec4 _1504 = sc_ApplyScreenSpaceInstancedClippedShift(param);
        return _1504;
    }
    #else // #if (sc_RenderingSpace==3)
    {
        #if (sc_RenderingSpace==2)
        {
            return sc_ViewProjectionMatrixArray[sc_GetStereoViewIndex()] * objectPosition;
        }
        #else // #if (sc_RenderingSpace==2)
        {
            #if (sc_RenderingSpace==1)
            {
                return sc_ModelViewProjectionMatrixArray[sc_GetStereoViewIndex()] * objectPosition;
            }
            #else // #if (sc_RenderingSpace==1)
            {
                #if (sc_RenderingSpace==4)
                {
                    objectPosition = (sc_ModelViewMatrixArray[sc_GetStereoViewIndex()] * objectPosition) * vec4(1.0 / sc_Camera.aspect, 1.0, 1.0, 1.0);
                    vec4 param_1 = objectPosition;
                    vec4 _1551 = sc_ApplyScreenSpaceInstancedClippedShift(param_1);
                    return _1551;
                }
                #else // #if (sc_RenderingSpace==4)
                {
                    return objectPosition;
                }
                #endif // #else // #if (sc_RenderingSpace==4)
            }
            #endif // #else // #if (sc_RenderingSpace==1)
        }
        #endif // #else // #if (sc_RenderingSpace==2)
    }
    #endif // #else // #if (sc_RenderingSpace==3)
}

vec4 sc_ObjectToView(vec4 objectPosition)
{
    #if (sc_RenderingSpace==3)
    {
        return sc_ProjectionMatrixInverseArray[sc_GetStereoViewIndex()] * objectPosition;
    }
    #else // #if (sc_RenderingSpace==3)
    {
        #if (sc_RenderingSpace==2)
        {
            return sc_ViewMatrixArray[sc_GetStereoViewIndex()] * objectPosition;
        }
        #else // #if (sc_RenderingSpace==2)
        {
            #if (sc_RenderingSpace==1)
            {
                return sc_ModelViewMatrixArray[sc_GetStereoViewIndex()] * objectPosition;
            }
            #else // #if (sc_RenderingSpace==1)
            {
                return objectPosition;
            }
            #endif // #else // #if (sc_RenderingSpace==1)
        }
        #endif // #else // #if (sc_RenderingSpace==2)
    }
    #endif // #else // #if (sc_RenderingSpace==3)
}

sc_Vertex_t sc_LoadVertexAttributes()
{
    sc_Vertex_t v;
    v.position = position;
    #if (sc_IsEditor&&SC_DISABLE_FRUSTUM_CULLING)
    {
        v.position.x += sc_DisableFrustumCullingMarker;
    }
    #endif // #if (sc_IsEditor&&SC_DISABLE_FRUSTUM_CULLING)
    #if (!STD_DISABLE_VERTEX_NORMAL)
    {
        v.normal = normal;
    }
    #endif // #if (!STD_DISABLE_VERTEX_NORMAL)
    #if (!STD_DISABLE_VERTEX_TANGENT)
    {
        v.tangent = tangent.xyz;
    }
    #endif // #if (!STD_DISABLE_VERTEX_TANGENT)
    #if (!STD_DISABLE_VERTEX_TEXTURE0)
    {
        v.texture0 = texture0;
    }
    #endif // #if (!STD_DISABLE_VERTEX_TEXTURE0)
    #if (!STD_DISABLE_VERTEX_TEXTURE1)
    {
        v.texture1 = texture1;
    }
    #endif // #if (!STD_DISABLE_VERTEX_TEXTURE1)
    return v;
}

vec4 applyDepthAlgorithm(inout vec4 screenPosition)
{
    #if (sc_DepthBufferMode==1)
    {
        float fCoefficient = 2.0 / log2(sc_Camera.clipPlanes.y + 1.0);
        screenPosition.z = ((log2(max(sc_Camera.clipPlanes.x, 1.0 + screenPosition.w)) * fCoefficient) - 1.0) * screenPosition.w;
    }
    #endif // #if (sc_DepthBufferMode==1)
    return screenPosition;
}

void sc_ProcessVertex(inout sc_Vertex_t v)
{
    sc_Vertex_t param = v;
    sc_BlendVertex(param);
    v = param;
    sc_Vertex_t param_1 = v;
    sc_SkinVertex(param_1);
    v = param_1;
    vec4 param_2 = v.position;
    vec4 _1677 = sc_ObjectToScreen(param_2);
    vec4 screenPosition = _1677;
    #if ((sc_RenderingSpace==3)||(sc_RenderingSpace==4))
    {
        varPos = screenPosition.xyz;
        #if (!STD_DISABLE_VERTEX_NORMAL)
        {
            varNormal = normalize(v.normal);
        }
        #endif // #if (!STD_DISABLE_VERTEX_NORMAL)
        #if (!STD_DISABLE_VERTEX_TANGENT)
        {
            vec3 _1700 = normalize(v.tangent);
            varTangent = vec4(_1700.x, _1700.y, _1700.z, varTangent.w);
        }
        #endif // #if (!STD_DISABLE_VERTEX_TANGENT)
    }
    #else // #if ((sc_RenderingSpace==3)||(sc_RenderingSpace==4))
    {
        #if (sc_RenderingSpace==2)
        {
            varPos = v.position.xyz;
            #if (!STD_DISABLE_VERTEX_NORMAL)
            {
                varNormal = normalize(v.normal);
            }
            #endif // #if (!STD_DISABLE_VERTEX_NORMAL)
            #if (!STD_DISABLE_VERTEX_TANGENT)
            {
                vec3 _1721 = normalize(v.tangent);
                varTangent = vec4(_1721.x, _1721.y, _1721.z, varTangent.w);
            }
            #endif // #if (!STD_DISABLE_VERTEX_TANGENT)
        }
        #else // #if (sc_RenderingSpace==2)
        {
            #if (sc_RenderingSpace==1)
            {
                varPos = (sc_ModelMatrix * v.position).xyz;
                #if (!STD_DISABLE_VERTEX_NORMAL)
                {
                    varNormal = normalize(sc_NormalMatrix * v.normal);
                }
                #endif // #if (!STD_DISABLE_VERTEX_NORMAL)
                #if (!STD_DISABLE_VERTEX_TANGENT)
                {
                    vec3 _1749 = normalize(sc_NormalMatrix * v.tangent);
                    varTangent = vec4(_1749.x, _1749.y, _1749.z, varTangent.w);
                }
                #endif // #if (!STD_DISABLE_VERTEX_TANGENT)
            }
            #endif // #if (sc_RenderingSpace==1)
        }
        #endif // #else // #if (sc_RenderingSpace==2)
    }
    #endif // #else // #if ((sc_RenderingSpace==3)||(sc_RenderingSpace==4))
    #if (!STD_DISABLE_VERTEX_TANGENT)
    {
        varTangent.w = tangent.w;
    }
    #endif // #if (!STD_DISABLE_VERTEX_TANGENT)
    #if (!STD_DISABLE_VERTEX_TEXTURE0)
    {
        varPackedTex = vec4(v.texture0.x, v.texture0.y, varPackedTex.z, varPackedTex.w);
    }
    #endif // #if (!STD_DISABLE_VERTEX_TEXTURE0)
    #if (!STD_DISABLE_VERTEX_TEXTURE1)
    {
        varPackedTex = vec4(varPackedTex.x, varPackedTex.y, v.texture1.x, v.texture1.y);
    }
    #endif // #if (!STD_DISABLE_VERTEX_TEXTURE1)
    varScreenPos = screenPosition;
    vec2 globalScreenCoords = ((screenPosition.xy / vec2(screenPosition.w)) * 0.5) + vec2(0.5);
    vec2 param_3 = globalScreenCoords;
    varScreenTexturePos = sc_ScreenCoordsGlobalToView(param_3);
    #if (sc_ProjectiveShadowsReceiver)
    {
        vec4 param_4 = v.position;
        varShadowTex = getProjectedTexCoords(param_4);
    }
    #endif // #if (sc_ProjectiveShadowsReceiver)
    #if ((sc_OITDepthGatherPass||sc_OITCompositingPass)||sc_OITDepthBoundsPass)
    {
        vec4 param_5 = v.position;
        varViewSpaceDepth = -sc_ObjectToView(param_5).z;
    }
    #endif // #if ((sc_OITDepthGatherPass||sc_OITCompositingPass)||sc_OITDepthBoundsPass)
    vec4 param_6 = screenPosition;
    vec4 _1814 = applyDepthAlgorithm(param_6);
    screenPosition = _1814;
    #if (sc_TAAEnabled)
    {
        vec2 _1826 = screenPosition.xy + (sc_TAAJitterOffset * screenPosition.w);
        screenPosition = vec4(_1826.x, _1826.y, screenPosition.z, screenPosition.w);
    }
    #endif // #if (sc_TAAEnabled)
    vec4 clipPosition = screenPosition * 1.0;
    vec4 param_7 = clipPosition;
    sc_SetClipPosition(param_7);
}

#elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
#include <std2_shadows.glsl>

#ifndef sc_DepthBufferMode
#define sc_DepthBufferMode 0
#endif
#ifndef sc_TAAEnabled
#define sc_TAAEnabled 0
#elif sc_TAAEnabled == 1
#undef sc_TAAEnabled
#define sc_TAAEnabled 1
#endif
#ifndef sc_SkinBonesCount
#define sc_SkinBonesCount 0
#endif
#ifndef sc_VertexBlending
#define sc_VertexBlending 0
#elif sc_VertexBlending == 1
#undef sc_VertexBlending
#define sc_VertexBlending 1
#endif
#ifndef sc_VertexBlendingUseNormals
#define sc_VertexBlendingUseNormals 0
#elif sc_VertexBlendingUseNormals == 1
#undef sc_VertexBlendingUseNormals
#define sc_VertexBlendingUseNormals 1
#endif
#ifndef STD_DISABLE_VERTEX_NORMAL
#define STD_DISABLE_VERTEX_NORMAL 0
#elif STD_DISABLE_VERTEX_NORMAL == 1
#undef STD_DISABLE_VERTEX_NORMAL
#define STD_DISABLE_VERTEX_NORMAL 1
#endif
#ifndef STD_DISABLE_VERTEX_TANGENT
#define STD_DISABLE_VERTEX_TANGENT 0
#elif STD_DISABLE_VERTEX_TANGENT == 1
#undef STD_DISABLE_VERTEX_TANGENT
#define STD_DISABLE_VERTEX_TANGENT 1
#endif
#ifndef STD_DISABLE_VERTEX_TEXTURE0
#define STD_DISABLE_VERTEX_TEXTURE0 0
#elif STD_DISABLE_VERTEX_TEXTURE0 == 1
#undef STD_DISABLE_VERTEX_TEXTURE0
#define STD_DISABLE_VERTEX_TEXTURE0 1
#endif
#ifndef STD_DISABLE_VERTEX_TEXTURE1
#define STD_DISABLE_VERTEX_TEXTURE1 0
#elif STD_DISABLE_VERTEX_TEXTURE1 == 1
#undef STD_DISABLE_VERTEX_TEXTURE1
#define STD_DISABLE_VERTEX_TEXTURE1 1
#endif
#ifndef SC_DISABLE_FRUSTUM_CULLING
#define SC_DISABLE_FRUSTUM_CULLING 0
#elif SC_DISABLE_FRUSTUM_CULLING == 1
#undef SC_DISABLE_FRUSTUM_CULLING
#define SC_DISABLE_FRUSTUM_CULLING 1
#endif

uniform highp float sc_DisableFrustumCullingMarker;

varying highp vec3 varPos;
varying highp vec3 varNormal;
varying highp vec4 varTangent;
varying highp vec4 varPackedTex;
varying highp vec4 varScreenPos;
varying highp vec2 varScreenTexturePos;
varying highp float varViewSpaceDepth;

#endif // #elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
