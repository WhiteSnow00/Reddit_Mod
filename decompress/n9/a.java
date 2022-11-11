// 
// Decompiled by Procyon v0.6.0
// 

package n9;

import java.io.IOException;
import java.io.EOFException;
import ej2.c0;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.Box;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

public abstract class a implements b
{
    public static Logger b;
    public a$a a;
    
    static {
        a.b = Logger.getLogger(a.class.getName());
    }
    
    public a() {
        this.a = new ThreadLocal<ByteBuffer>() {
            public final Object initialValue() {
                return ByteBuffer.allocate(32);
            }
        };
    }
    
    public abstract Box a(final String p0, final String p1, final byte[] p2);
    
    public final Box b(final com.googlecode.mp4parser.a a, final Container parent) throws IOException {
        final long position = a.position();
        this.a.get().rewind().limit(8);
        while (true) {
            final int read = a.read((ByteBuffer)this.a.get());
            if (read == 8) {
                this.a.get().rewind();
                final long a2 = c0.a4((ByteBuffer)this.a.get());
                long position2 = 8L;
                byte[] array = null;
                if (a2 < 8L && a2 > 1L) {
                    final Logger b = a.b;
                    final StringBuilder sb = new StringBuilder("Plausibility check failed: size < 8 (size = ");
                    sb.append(a2);
                    sb.append("). Stop parsing!");
                    b.severe(sb.toString());
                    return null;
                }
                final String q3 = c0.Q3((ByteBuffer)this.a.get());
                long n;
                if (a2 == 1L) {
                    this.a.get().limit(16);
                    a.read((ByteBuffer)this.a.get());
                    this.a.get().position(8);
                    n = c0.b4((ByteBuffer)this.a.get()) - 16L;
                }
                else {
                    long size = a2;
                    if (a2 == 0L) {
                        size = a.size();
                        position2 = a.position();
                    }
                    n = size - position2;
                }
                if ("uuid".equals(q3)) {
                    this.a.get().limit(this.a.get().limit() + 16);
                    a.read((ByteBuffer)this.a.get());
                    array = new byte[16];
                    for (int i = this.a.get().position() - 16; i < this.a.get().position(); ++i) {
                        array[i - (this.a.get().position() - 16)] = this.a.get().get(i);
                    }
                    n -= 16L;
                }
                String type;
                if (parent instanceof Box) {
                    type = ((Box)parent).getType();
                }
                else {
                    type = "";
                }
                final Box a3 = this.a(q3, type, array);
                a3.setParent(parent);
                this.a.get().rewind();
                a3.parse(a, (ByteBuffer)this.a.get(), n, (b)this);
                return a3;
            }
            else {
                if (read >= 0) {
                    continue;
                }
                a.position(position);
                throw new EOFException();
            }
        }
    }
}
