// 
// Decompiled by Procyon v0.6.0
// 

package r9;

import q9.a;

public final class b extends a
{
    public final int j;
    
    public b() {
        final StringBuilder r = a.r("#extension GL_OES_EGL_image_external : require\n");
        r.append("precision mediump float;\nvarying highp vec2 vTextureCoord;\nuniform lowp sampler2D sTexture;\nvoid main() {\ngl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n".replace("sampler2D", "samplerExternalOES"));
        super("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nuniform float uCRatio;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying highp vec2 vTextureCoord;\nvoid main() {\nvec4 scaledPos = aPosition;\nscaledPos.x = scaledPos.x * uCRatio;\ngl_Position = uMVPMatrix * scaledPos;\nvTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", r.toString());
        this.j = 36197;
    }
}
