#pragma once
#if defined VERTEX_SHADER
#include <required2.glsl>
#include <std2_vs.glsl>

struct sc_HairVertex
{
    vec4 position;
    vec3 normal;
    vec3 tangent;
    vec2 texture0;
    vec4 debugColor;
    int strandId;
};

#ifndef sc_HairFallbackMode
#define sc_HairFallbackMode 0
#elif sc_HairFallbackMode == 1
#undef sc_HairFallbackMode
#define sc_HairFallbackMode 1
#endif
#ifndef sc_HairDebugMode
#define sc_HairDebugMode 0
#elif sc_HairDebugMode == 1
#undef sc_HairDebugMode
#define sc_HairDebugMode 1
#endif
uniform float clumpInstanceCount;
uniform float hairstyleInstanceCount;
uniform vec4 strandDataMapTextureSize;
uniform mediump sampler2D strandDataMapTexture;
uniform float hairstyleNoise;
uniform float clumpTipScale;
uniform float clumpRadius;
uniform float strandWidth;
uniform float strandTaper;

attribute vec3 positionNext;
attribute vec3 positionPrevious;
attribute vec4 strandProperties;

float rand_arg2f(vec2 co)
{
    return fract(sin(dot(co, vec2(12.9898, 78.233))) * 43758.5);
}

sc_HairVertex sc_GenerateHairVertexInViewspace(sc_Vertex_t v)
{
    sc_HairVertex hv;
    #if (!sc_HairFallbackMode)
    {
        float instanceId = float(sc_GetLocalInstanceID());
        float strandInstanceCount = (1.0 + clumpInstanceCount) + hairstyleInstanceCount;
        float instanceCount = strandDataMapTextureSize.y * strandInstanceCount;
        float basicStrandIndex = floor((instanceId / strandInstanceCount) + 0.0001);
        float basicStrandInstanceId = basicStrandIndex * strandInstanceCount;
        float relativeInstanceId = instanceId - basicStrandInstanceId;
        bool isSingleInterpolationStrand = (relativeInstanceId > 0.0) && (relativeInstanceId <= clumpInstanceCount);
        bool isMultiInterpolationStrand = (relativeInstanceId > clumpInstanceCount) && (relativeInstanceId < strandInstanceCount);
        bool isBasicStrand = (!isSingleInterpolationStrand) && (!isMultiInterpolationStrand);
        vec2 uvAbsoluteMax = vec2(strandDataMapTextureSize.x - 1.0, strandDataMapTextureSize.y - 1.0);
        vec2 uvOffsetX = vec2(1.0 / uvAbsoluteMax.x, 0.0);
        vec2 randomTerms = vec2(instanceId / instanceCount, (instanceCount - instanceId) / instanceCount);
        vec3 randomOffset = vec3(0.0);
        vec2 param = randomTerms.xx;
        randomOffset.x = (rand_arg2f(param) * 2.0) - 1.0;
        vec2 param_1 = vec2(randomOffset.x, randomTerms.x);
        randomOffset.y = (rand_arg2f(param_1) * 2.0) - 1.0;
        vec2 param_2 = vec2(randomOffset.x, randomOffset.y);
        randomOffset.z = (rand_arg2f(param_2) * 2.0) - 1.0;
        vec2 uv = vec2(v.position.y / uvAbsoluteMax.x, basicStrandIndex / uvAbsoluteMax.y);
        bool pointIsNotLast = v.position.y < uvAbsoluteMax.x;
        bool pointIsNotFirst = v.position.y > 0.0;
        vec3 pointWorldPosition = texture2D(strandDataMapTexture, uv).xyz;
        vec3 _1992;
        if (pointIsNotLast)
        {
            _1992 = texture2D(strandDataMapTexture, uv + uvOffsetX).xyz;
        }
        else
        {
            _1992 = pointWorldPosition;
        }
        vec3 pointWorldPositionNext = _1992;
        vec3 _2006;
        if (pointIsNotFirst)
        {
            _2006 = texture2D(strandDataMapTexture, uv - uvOffsetX).xyz;
        }
        else
        {
            _2006 = pointWorldPosition;
        }
        vec3 pointWorldPositionPrevious = _2006;
        vec3 strandPointOffset = vec3(0.0);
        vec3 strandPointOffsetNext = vec3(0.0);
        vec3 strandPointOffsetPrevious = vec3(0.0);
        vec2 neighbourIndices = vec2(-1.0);
        if (isMultiInterpolationStrand)
        {
            neighbourIndices.x = texture2D(strandDataMapTexture, vec2(0.0, uv.y)).w;
            neighbourIndices.y = texture2D(strandDataMapTexture, vec2(uvOffsetX.x, uv.y)).w;
            float _2044 = neighbourIndices.x;
            bool _2045 = _2044 < 0.0;
            bool _2051;
            if (_2045)
            {
                _2051 = neighbourIndices.y < 0.0;
            }
            else
            {
                _2051 = _2045;
            }
            if (_2051)
            {
                isSingleInterpolationStrand = true;
                isMultiInterpolationStrand = false;
            }
        }
        if (isMultiInterpolationStrand)
        {
            vec3 pointWorldPositionInterpolated = pointWorldPosition;
            vec3 pointWorldPositionInterpolatedNext = pointWorldPositionNext;
            vec3 pointWorldPositionInterpolatedPrevious = pointWorldPositionPrevious;
            if (neighbourIndices.x >= 0.0)
            {
                vec2 uv1 = vec2(uv.x, neighbourIndices.x / uvAbsoluteMax.y);
                vec3 pointWorldPosition1 = texture2D(strandDataMapTexture, uv1).xyz;
                vec2 param_3 = randomTerms;
                float lerpTerm1 = rand_arg2f(param_3);
                pointWorldPositionInterpolated = mix(pointWorldPositionInterpolated, pointWorldPosition1, vec3(lerpTerm1));
                if (pointIsNotLast)
                {
                    vec3 pointWorldPositionNext1 = texture2D(strandDataMapTexture, uv1 + uvOffsetX).xyz;
                    pointWorldPositionInterpolatedNext = mix(pointWorldPositionInterpolatedNext, pointWorldPositionNext1, vec3(lerpTerm1));
                }
                if (pointIsNotFirst)
                {
                    vec3 pointWorldPositionPrevious1 = texture2D(strandDataMapTexture, uv1 - uvOffsetX).xyz;
                    pointWorldPositionInterpolatedPrevious = mix(pointWorldPositionInterpolatedPrevious, pointWorldPositionPrevious1, vec3(lerpTerm1));
                }
            }
            if (neighbourIndices.y >= 0.0)
            {
                vec2 uv2 = vec2(uv.x, neighbourIndices.y / uvAbsoluteMax.y);
                vec3 pointWorldPosition2 = texture2D(strandDataMapTexture, uv2).xyz;
                vec2 param_4 = randomTerms.xx;
                float lerpTerm2 = rand_arg2f(param_4);
                pointWorldPositionInterpolated = mix(pointWorldPositionInterpolated, pointWorldPosition2, vec3(lerpTerm2));
                if (pointIsNotLast)
                {
                    vec3 pointWorldPositionNext2 = texture2D(strandDataMapTexture, uv2 + uvOffsetX).xyz;
                    pointWorldPositionInterpolatedNext = mix(pointWorldPositionInterpolatedNext, pointWorldPositionNext2, vec3(lerpTerm2));
                }
                if (pointIsNotFirst)
                {
                    vec3 pointWorldPositionPrevious2 = texture2D(strandDataMapTexture, uv2 - uvOffsetX).xyz;
                    pointWorldPositionInterpolatedPrevious = mix(pointWorldPositionInterpolatedPrevious, pointWorldPositionPrevious2, vec3(lerpTerm2));
                }
            }
            vec3 noiseOffset = randomOffset * hairstyleNoise;
            strandPointOffset = pointWorldPositionInterpolated - pointWorldPosition;
            strandPointOffset += noiseOffset;
            strandPointOffsetNext = pointWorldPositionInterpolatedNext - pointWorldPositionNext;
            strandPointOffsetNext += noiseOffset;
            strandPointOffsetPrevious = pointWorldPositionInterpolatedPrevious - pointWorldPositionPrevious;
            strandPointOffsetPrevious += noiseOffset;
        }
        else
        {
            if (isSingleInterpolationStrand)
            {
                float _2212;
                if (clumpTipScale < 0.0)
                {
                    _2212 = clumpRadius * clumpTipScale;
                }
                else
                {
                    _2212 = clumpTipScale;
                }
                float clumpTipScaleTerm = _2212;
                strandPointOffset = randomOffset * (clumpRadius + (uv.x * clumpTipScaleTerm));
                strandPointOffsetNext = randomOffset * (clumpRadius + ((uv.x + uvOffsetX.x) * clumpTipScaleTerm));
                strandPointOffsetPrevious = randomOffset * (clumpRadius + ((uv.x - uvOffsetX.x) * clumpTipScaleTerm));
            }
        }
        pointWorldPosition += strandPointOffset;
        vec4 pointViewPosition = sc_ViewMatrixArray[sc_GetStereoViewIndex()] * vec4(pointWorldPosition, 1.0);
        vec3 smoothedTangent = vec3(0.0);
        if (pointIsNotLast)
        {
            vec4 pointViewPositionNext = sc_ViewMatrixArray[sc_GetStereoViewIndex()] * vec4(pointWorldPositionNext + strandPointOffsetNext, 1.0);
            smoothedTangent = normalize(pointViewPositionNext.xyz - pointViewPosition.xyz);
        }
        if (pointIsNotFirst)
        {
            vec4 pointViewPositionPrevious = sc_ViewMatrixArray[sc_GetStereoViewIndex()] * vec4(pointWorldPositionPrevious + strandPointOffsetPrevious, 1.0);
            smoothedTangent += normalize(pointViewPosition.xyz - pointViewPositionPrevious.xyz);
        }
        float _2311 = v.position.y;
        bool _2312 = _2311 > 0.0;
        bool _2320;
        if (_2312)
        {
            _2320 = v.position.y < uvAbsoluteMax.x;
        }
        else
        {
            _2320 = _2312;
        }
        if (_2320)
        {
            smoothedTangent *= 0.5;
        }
        hv.tangent = smoothedTangent;
        vec3 smoothedBinormal = vec3(smoothedTangent.y, -smoothedTangent.x, smoothedTangent.z);
        hv.normal = normalize(cross(smoothedTangent, smoothedBinormal));
        vec2 _2360 = pointViewPosition.xy + (((smoothedBinormal.xy * v.position.x) * strandWidth) * (1.0 - (uv.x * strandTaper)));
        pointViewPosition = vec4(_2360.x, _2360.y, pointViewPosition.z, pointViewPosition.w);
        hv.position = pointViewPosition;
        hv.texture0 = vec2(((-v.position.x) * 0.5) + 0.5, 1.0 - uv.x);
        hv.strandId = sc_GetLocalInstanceID();
        hv.debugColor = vec4(0.0);
        #if (sc_HairDebugMode)
        {
            if (isBasicStrand)
            {
                hv.debugColor = vec4(0.0, 1.0, 0.0, 1.0);
            }
            else
            {
                if (isSingleInterpolationStrand)
                {
                    hv.debugColor = vec4(0.0, 0.0, 1.0, 1.0);
                }
                else
                {
                    if (isMultiInterpolationStrand)
                    {
                        hv.debugColor = vec4(1.0, 0.0, 0.0, 1.0);
                    }
                }
            }
        }
        #endif // #if (sc_HairDebugMode)
    }
    #else // #if (!sc_HairFallbackMode)
    {
        vec4 pointViewPosition_1 = sc_ModelViewMatrixArray[sc_GetStereoViewIndex()] * vec4(v.position.x, v.position.y, v.position.z, 1.0);
        vec4 pointViewPositionNext_1 = sc_ModelViewMatrixArray[sc_GetStereoViewIndex()] * vec4(positionNext.x, positionNext.y, positionNext.z, 1.0);
        vec4 pointViewPositionPrevious_1 = sc_ModelViewMatrixArray[sc_GetStereoViewIndex()] * vec4(positionPrevious.x, positionPrevious.y, positionPrevious.z, 1.0);
        vec3 smoothedTangent_1 = vec3(0.0);
        float strandPointNormalizedDistance = strandProperties.y;
        if (strandPointNormalizedDistance < 1.0)
        {
            smoothedTangent_1 += normalize(pointViewPositionNext_1.xyz - pointViewPosition_1.xyz);
        }
        if (strandPointNormalizedDistance > 0.0)
        {
            smoothedTangent_1 += normalize(pointViewPosition_1.xyz - pointViewPositionPrevious_1.xyz);
        }
        if ((strandPointNormalizedDistance > 0.0) && (strandPointNormalizedDistance < 1.0))
        {
            smoothedTangent_1 *= 0.5;
        }
        hv.tangent = smoothedTangent_1;
        float binormalSign = strandProperties.x;
        vec2 smoothedBinormal_1 = vec2(smoothedTangent_1.y, -smoothedTangent_1.x);
        vec2 _2502 = pointViewPosition_1.xy + (((smoothedBinormal_1 * binormalSign) * strandWidth) * (1.0 - ((1.0 - texture0.y) * strandTaper)));
        pointViewPosition_1 = vec4(_2502.x, _2502.y, pointViewPosition_1.z, pointViewPosition_1.w);
        hv.position = pointViewPosition_1;
        hv.texture0 = v.texture0;
        hv.strandId = int(strandProperties.w);
        #if (sc_HairDebugMode)
        {
            float strandType = strandProperties.z;
            hv.debugColor = vec4(float(strandType == 2.0), float(strandType == 0.0), float(strandType == 1.0), 1.0);
        }
        #else // #if (sc_HairDebugMode)
        {
            hv.debugColor = vec4(0.0);
        }
        #endif // #else // #if (sc_HairDebugMode)
    }
    #endif // #else // #if (!sc_HairFallbackMode)
    return hv;
}

#elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
#include <required2.glsl>



highp float rand_arg2f(highp vec2 co)
{
    return fract(sin(dot(co, vec2(12.9898, 78.233))) * 43758.5);
}

#endif // #elif defined FRAGMENT_SHADER // #if defined VERTEX_SHADER
