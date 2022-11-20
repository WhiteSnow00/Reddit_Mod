// 
// Decompiled by Procyon v0.6.0
// 

package sb;

import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;

public final class c
{
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;
    
    public c() {
        final ByteArrayOutputStream a = new ByteArrayOutputStream(512);
        this.a = a;
        this.b = new DataOutputStream(a);
    }
    
    public final byte[] a(final a a) {
        this.a.reset();
        try {
            final DataOutputStream b = this.b;
            b.writeBytes(a.f);
            b.writeByte(0);
            String g = a.g;
            if (g == null) {
                g = "";
            }
            final DataOutputStream b2 = this.b;
            b2.writeBytes(g);
            b2.writeByte(0);
            this.b.writeLong(a.h);
            this.b.writeLong(a.i);
            this.b.write(a.j);
            this.b.flush();
            return this.a.toByteArray();
        }
        catch (final IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
