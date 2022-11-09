// 
// Decompiled by Procyon v0.6.0
// 

package k8;

import java.nio.ByteOrder;
import java.util.Arrays;
import java.nio.BufferUnderflowException;
import ak0.m;
import android.util.Log;
import java.nio.ByteBuffer;

public final class d
{
    public final byte[] a;
    public ByteBuffer b;
    public c c;
    public int d;
    
    public d() {
        this.a = new byte[256];
        this.d = 0;
    }
    
    public final boolean a() {
        return this.c.b != 0;
    }
    
    public final c b() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (this.a()) {
            return this.c;
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; ++i) {
            sb.append((char)this.c());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.c.b = 1;
        }
        else {
            this.c.f = this.f();
            this.c.g = this.f();
            final int c = this.c();
            final c c2 = this.c;
            c2.h = ((c & 0x80) != 0x0);
            c2.i = (int)Math.pow(2.0, (c & 0x7) + 1);
            this.c.j = this.c();
            final c c3 = this.c;
            this.c();
            c3.getClass();
            if (this.c.h && !this.a()) {
                final c c4 = this.c;
                c4.a = this.e(c4.i);
                final c c5 = this.c;
                c5.k = c5.a[c5.j];
            }
        }
        if (!this.a()) {
            int n = 0;
            while (n == 0 && !this.a() && this.c.c <= Integer.MAX_VALUE) {
                final int c6 = this.c();
                if (c6 != 33) {
                    if (c6 != 44) {
                        if (c6 != 59) {
                            this.c.b = 1;
                        }
                        else {
                            n = 1;
                        }
                    }
                    else {
                        final c c7 = this.c;
                        if (c7.d == null) {
                            c7.d = new b();
                        }
                        this.c.d.a = this.f();
                        this.c.d.b = this.f();
                        this.c.d.c = this.f();
                        this.c.d.d = this.f();
                        final int c8 = this.c();
                        final boolean b = (c8 & 0x80) != 0x0;
                        final int n2 = (int)Math.pow(2.0, (c8 & 0x7) + 1);
                        final b d = this.c.d;
                        d.e = ((c8 & 0x40) != 0x0);
                        if (b) {
                            d.k = this.e(n2);
                        }
                        else {
                            d.k = null;
                        }
                        this.c.d.j = this.b.position();
                        this.c();
                        this.h();
                        if (this.a()) {
                            continue;
                        }
                        final c c9 = this.c;
                        ++c9.c;
                        c9.e.add(c9.d);
                    }
                }
                else {
                    final int c10 = this.c();
                    if (c10 != 1) {
                        if (c10 != 249) {
                            if (c10 != 254) {
                                if (c10 != 255) {
                                    this.h();
                                }
                                else {
                                    this.d();
                                    final StringBuilder sb2 = new StringBuilder();
                                    for (int j = 0; j < 11; ++j) {
                                        sb2.append((char)this.a[j]);
                                    }
                                    if (sb2.toString().equals("NETSCAPE2.0")) {
                                        do {
                                            this.d();
                                            final byte[] a = this.a;
                                            if (a[0] == 1) {
                                                final byte b2 = a[1];
                                                final byte b3 = a[2];
                                                this.c.getClass();
                                            }
                                            if (this.d > 0) {
                                                continue;
                                            }
                                            break;
                                        } while (!this.a());
                                    }
                                    else {
                                        this.h();
                                    }
                                }
                            }
                            else {
                                this.h();
                            }
                        }
                        else {
                            this.c.d = new b();
                            this.c();
                            final int c11 = this.c();
                            final b d2 = this.c.d;
                            if ((d2.g = (c11 & 0x1C) >> 2) == 0) {
                                d2.g = 1;
                            }
                            d2.f = ((c11 & 0x1) != 0x0);
                            int f;
                            if ((f = this.f()) < 2) {
                                f = 10;
                            }
                            final b d3 = this.c.d;
                            d3.i = f * 10;
                            d3.h = this.c();
                            this.c();
                        }
                    }
                    else {
                        this.h();
                    }
                }
            }
            final c c12 = this.c;
            if (c12.c < 0) {
                c12.b = 1;
            }
        }
        return this.c;
    }
    
    public final int c() {
        int n;
        try {
            n = (this.b.get() & 0xFF);
        }
        catch (final Exception ex) {
            this.c.b = 1;
            n = 0;
        }
        return n;
    }
    
    public final void d() {
        final int c = this.c();
        this.d = c;
        if (c > 0) {
            int n = 0;
            int n2 = 0;
            while (true) {
                int n3 = n2;
                try {
                    final int d = this.d;
                    if (n < d) {
                        n2 = (n3 = d - n);
                        this.b.get(this.a, n, n2);
                        n += n2;
                        continue;
                    }
                }
                catch (final Exception ex) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        final StringBuilder r = m.r("Error Reading Block n: ", n, " count: ", n3, " blockSize: ");
                        r.append(this.d);
                        Log.d("GifHeaderParser", r.toString(), (Throwable)ex);
                    }
                    this.c.b = 1;
                }
                break;
            }
        }
    }
    
    public final int[] e(final int n) {
        final byte[] array = new byte[n * 3];
        int[] array2 = null;
        try {
            this.b.get(array);
            array2 = array2;
            final int[] array3 = new int[256];
            int n2 = 0;
            int n3 = 0;
            while (true) {
                array2 = array3;
                if (n2 >= n) {
                    break;
                }
                final int n4 = n3 + 1;
                final byte b = array[n3];
                final int n5 = n4 + 1;
                array3[n2] = ((b & 0xFF) << 16 | 0xFF000000 | (array[n4] & 0xFF) << 8 | (array[n5] & 0xFF));
                n3 = n5 + 1;
                ++n2;
            }
        }
        catch (final BufferUnderflowException ex) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", (Throwable)ex);
            }
            this.c.b = 1;
        }
        return array2;
    }
    
    public final int f() {
        return this.b.getShort();
    }
    
    public final void g(ByteBuffer readOnlyBuffer) {
        this.b = null;
        Arrays.fill(this.a, (byte)0);
        this.c = new c();
        this.d = 0;
        readOnlyBuffer = readOnlyBuffer.asReadOnlyBuffer();
        (this.b = readOnlyBuffer).position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
    }
    
    public final void h() {
        int i;
        do {
            i = this.c();
            this.b.position(Math.min(this.b.position() + i, this.b.limit()));
        } while (i > 0);
    }
}
