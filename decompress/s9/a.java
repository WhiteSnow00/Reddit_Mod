// 
// Decompiled by Procyon v0.6.0
// 

package s9;

import java.nio.Buffer;
import android.opengl.GLES20;

public final class a
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    public final void a() {
        final int[] array = { this.e };
        GLES20.glDeleteTextures(1, array, 0);
        array[this.e = 0] = this.d;
        GLES20.glDeleteRenderbuffers(1, array, 0);
        array[this.d = 0] = this.c;
        GLES20.glDeleteFramebuffers(1, array, 0);
        this.c = 0;
    }
    
    public final void b(int glCheckFramebufferStatus, final int b) {
        final int[] array = { 0 };
        GLES20.glGetIntegerv(3379, array, 0);
        final int n = array[0];
        if (glCheckFramebufferStatus <= n && b <= n) {
            GLES20.glGetIntegerv(34024, array, 0);
            final int n2 = array[0];
            if (glCheckFramebufferStatus <= n2 && b <= n2) {
                GLES20.glGetIntegerv(36006, array, 0);
                final int n3 = array[0];
                GLES20.glGetIntegerv(36007, array, 0);
                final int n4 = array[0];
                GLES20.glGetIntegerv(32873, array, 0);
                final int n5 = array[0];
                this.a();
                try {
                    this.a = glCheckFramebufferStatus;
                    this.b = b;
                    GLES20.glGenFramebuffers(1, array, 0);
                    GLES20.glBindFramebuffer(36160, this.c = array[0]);
                    GLES20.glGenRenderbuffers(1, array, 0);
                    GLES20.glBindRenderbuffer(36161, this.d = array[0]);
                    GLES20.glRenderbufferStorage(36161, 33189, glCheckFramebufferStatus, b);
                    GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.d);
                    GLES20.glGenTextures(1, array, 0);
                    GLES20.glBindTexture(3553, this.e = array[0]);
                    GLES20.glTexParameterf(3553, 10240, (float)9729);
                    GLES20.glTexParameterf(3553, 10241, (float)9728);
                    GLES20.glTexParameteri(3553, 10242, 33071);
                    GLES20.glTexParameteri(3553, 10243, 33071);
                    GLES20.glTexImage2D(3553, 0, 6408, glCheckFramebufferStatus, b, 0, 6408, 5121, (Buffer)null);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.e, 0);
                    glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
                    if (glCheckFramebufferStatus == 36053) {
                        GLES20.glBindFramebuffer(36160, n3);
                        GLES20.glBindRenderbuffer(36161, n4);
                        GLES20.glBindTexture(3553, n5);
                        return;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to initialize framebuffer object ");
                    sb.append(glCheckFramebufferStatus);
                    throw new RuntimeException(sb.toString());
                }
                catch (final RuntimeException ex) {
                    this.a();
                    throw ex;
                }
            }
            final StringBuilder t = a.t("GL_MAX_RENDERBUFFER_SIZE ");
            t.append(array[0]);
            throw new IllegalArgumentException(t.toString());
        }
        final StringBuilder t2 = a.t("GL_MAX_TEXTURE_SIZE ");
        t2.append(array[0]);
        throw new IllegalArgumentException(t2.toString());
    }
}
