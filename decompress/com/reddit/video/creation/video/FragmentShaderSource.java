// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video;

import com.reddit.video.creation.models.video.VideoFilter;
import kotlin.text.a;
import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010" }, d2 = { "Lcom/reddit/video/creation/video/FragmentShaderSource;", "", "()V", "TEXT_OVERLAY_TEXTURE_START_INDEX", "", "createSource", "", "applyVideoFilterFunctionSource", "textStickersTexture", "textStickersTextureInit", "textStickersTextureColor", "prevColor", "generateFragmentShaderSource", "filter", "Lcom/reddit/video/creation/models/video/VideoFilter;", "texturesCount", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class FragmentShaderSource
{
    public static final int $stable = 0;
    public static final FragmentShaderSource INSTANCE;
    private static final int TEXT_OVERLAY_TEXTURE_START_INDEX = 4;
    
    static {
        INSTANCE = new FragmentShaderSource();
    }
    
    private FragmentShaderSource() {
    }
    
    public static final String createSource(final String s, final String s2, final String s3, final String s4, final String s5) {
        e.f((Object)s, "applyVideoFilterFunctionSource");
        e.f((Object)s2, "textStickersTexture");
        e.f((Object)s3, "textStickersTextureInit");
        e.f((Object)s4, "textStickersTextureColor");
        e.f((Object)s5, "prevColor");
        final StringBuilder sb = new StringBuilder();
        sb.append("\n        #extension GL_OES_EGL_image_external : require\n        precision mediump float;\n        varying vec2 vTextureCoord;\n        varying vec2 vOverlayTextureCoord;\n        uniform samplerExternalOES sTexture;\n        uniform sampler2D sTexture1;\n        uniform sampler2D sTexture2;\n        uniform sampler2D sTexture3;\n        ");
        sb.append(s2);
        sb.append("\n\n        ");
        sb.append(s);
        sb.append("\n\n        void mixColor(in vec4 backColor, in vec4 topColor, out vec4 outputColor)\n        {\n            float a = topColor.a + backColor.a * (1.0 - topColor.a);\n            float alphaDivisor = a + step(a, 0.0);\n            outputColor.r = (topColor.r * topColor.a + backColor.r * backColor.a * (1.0 - topColor.a))/alphaDivisor;\n            outputColor.g = (topColor.g * topColor.a + backColor.g * backColor.a * (1.0 - topColor.a))/alphaDivisor;\n            outputColor.b = (topColor.b * topColor.a + backColor.b * backColor.a * (1.0 - topColor.a))/alphaDivisor;\n            outputColor.a = a;\n        }\n        void main()\n        {\n            vec4 baseColor = texture2D(sTexture, vTextureCoord);\n            vec4 filteredColor = applyVideoFilter(baseColor, vTextureCoord);\n            vec4 overlayColor = texture2D(sTexture1, vOverlayTextureCoord);\n            vec4 watermarkColor = texture2D(sTexture2, vOverlayTextureCoord);\n            vec4 hashTagColor = texture2D(sTexture3, vOverlayTextureCoord);\n            ");
        d.A(sb, s3, "\n            vec4 clearColor;\n            mixColor(filteredColor, overlayColor, clearColor);\n            vec4 brandedColor;\n            mixColor(clearColor, watermarkColor, brandedColor);\n            vec4 outputColor;\n            mixColor(brandedColor, hashTagColor, outputColor);\n            ", s4, "\n            gl_FragColor = ");
        sb.append(s5);
        sb.append(";\n        }\n    ");
        return a.x0(sb.toString());
    }
    
    public static final String generateFragmentShaderSource(final VideoFilter videoFilter, final int n) {
        e.f((Object)videoFilter, "filter");
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        final StringBuilder sb3 = new StringBuilder();
        String string = "outputColor";
        int n2 = 4;
        for (int i = 0; i < n; ++i) {
            sb.append("uniform sampler2D sTexture");
            sb.append(n2);
            sb.append(";\n\t\t");
            sb2.append("vec4 textureOverlay");
            sb2.append(n2);
            sb2.append(" = texture2D(sTexture");
            sb2.append(n2);
            sb2.append(", vOverlayTextureCoord);\n\t\t\t");
            sb3.append("vec4 textureOverlayColor");
            sb3.append(n2);
            sb3.append(";\n\t\t\tmixColor(");
            sb3.append(string);
            sb3.append(", textureOverlay");
            sb3.append(n2);
            sb3.append(", textureOverlayColor");
            sb3.append(n2);
            sb3.append(");\n\t\t\t");
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("textureOverlayColor");
            sb4.append(n2);
            string = sb4.toString();
            ++n2;
        }
        final String processFragmentShaderFunctionSource = videoFilter.getProcessFragmentShaderFunctionSource();
        final String string2 = sb.toString();
        e.e((Object)string2, "texturesDeclaration.toString()");
        final String string3 = sb2.toString();
        e.e((Object)string3, "textureColorsDeclaration.toString()");
        final String string4 = sb3.toString();
        e.e((Object)string4, "mixColorFunctionCalls.toString()");
        return createSource(processFragmentShaderFunctionSource, string2, string3, string4, string);
    }
}
