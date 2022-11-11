// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import kotlin.text.a;
import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006" }, d2 = { "Lcom/reddit/video/creation/video/render/VertexShaderSource;", "", "()V", "createSource", "", "processVertexShaderFunctionSource", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class VertexShaderSource
{
    public static final int $stable = 0;
    public static final VertexShaderSource INSTANCE;
    
    static {
        INSTANCE = new VertexShaderSource();
    }
    
    private VertexShaderSource() {
    }
    
    public static final String createSource(final String s) {
        e.f((Object)s, "processVertexShaderFunctionSource");
        final StringBuilder sb = new StringBuilder();
        sb.append("\n        uniform mat4 uMVPMatrix;\n        uniform mat4 uSTMatrix;\n        uniform mat4 uOverlaySTMatrix;\n        uniform float uXScaleFactor;\n        uniform float uYScaleFactor;\n        uniform float uXOffset;\n        uniform float uYOffset;\n        uniform float uMirrorOffset;\n        uniform float uMirrorFactor;\n        uniform float uOverlayMirrorOffset;\n        uniform float uOverlayMirrorFactor;\n        uniform mat4 uRotationMatrix;\n        attribute vec4 aPosition;\n        attribute vec4 aTextureCoord;\n\n        varying vec2 vTextureCoord;\n        varying vec2 vOverlayTextureCoord;\n\n        ");
        sb.append(s);
        sb.append("\n\n        void main()\n        {\n            gl_Position = uMVPMatrix * aPosition;\n\n            vec4 mirroredCoords = vec4(\n                uMirrorOffset - uMirrorFactor * aTextureCoord.x,\n                aTextureCoord.y,\n                aTextureCoord.z,\n                aTextureCoord.w\n            );\n\n            vec4 scaleFactor = vec4(uXScaleFactor, uYScaleFactor, 1.0, 1.0);\n            vec4 scaleOffset = vec4(uXOffset, uYOffset, 0.0, 0.0);\n            vec4 scaledCoords = (mirroredCoords * scaleFactor) + scaleOffset;\n            vec4 stCoords = uSTMatrix * scaledCoords;\n            vec4 rotationOffset = vec4(0.5, 0.5, 0.0, 0.0);\n            vec4 coords1 = stCoords - rotationOffset;\n            vec4 coords2 = uRotationMatrix * coords1;\n            vec4 rotatedCoords = coords2 + rotationOffset;\n            vTextureCoord = rotatedCoords.xy;\n\n            vec4 mirroredOverlayCoords = vec4(\n                uOverlayMirrorOffset - uOverlayMirrorFactor * aTextureCoord.x,\n                aTextureCoord.y,\n                aTextureCoord.z,\n                aTextureCoord.w\n            );\n\n            vOverlayTextureCoord = processVertexShader((uOverlaySTMatrix * mirroredOverlayCoords).xy);\n        }\n    ");
        return a.x0(sb.toString());
    }
}
