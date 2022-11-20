// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import ya.a$a;
import com.google.android.exoplayer2.n;
import java.util.Collections;
import bd.s;
import db.w$a;
import com.google.android.exoplayer2.n$a;
import bd.t;
import db.w;

public final class a extends TagPayloadReader
{
    public static final int[] e;
    public boolean b;
    public boolean c;
    public int d;
    
    static {
        e = new int[] { 5512, 11025, 22050, 44100 };
    }
    
    public a(final w w) {
        super(w);
    }
    
    public final boolean a(final t t) throws TagPayloadReader.UnsupportedFormatException {
        if (!this.b) {
            final int r = t.r();
            final int d = r >> 4 & 0xF;
            if ((this.d = d) == 2) {
                final int y = a.e[r >> 2 & 0x3];
                final n$a n$a = new n$a();
                n$a.k = "audio/mpeg";
                n$a.x = 1;
                n$a.y = y;
                super.a.a(n$a.a());
                this.c = true;
            }
            else if (d != 7 && d != 8) {
                if (d != 10) {
                    throw new TagPayloadReader.UnsupportedFormatException(m5.a.c(39, "Audio format not supported: ", this.d));
                }
            }
            else {
                String k;
                if (d == 7) {
                    k = "audio/g711-alaw";
                }
                else {
                    k = "audio/g711-mlaw";
                }
                final n$a n$a2 = new n$a();
                n$a2.k = k;
                n$a2.x = 1;
                n$a2.y = 8000;
                super.a.a(n$a2.a());
                this.c = true;
            }
            this.b = true;
        }
        else {
            t.C(1);
        }
        return true;
    }
    
    public final boolean b(final long n, final t t) throws ParserException {
        if (this.d == 2) {
            final int n2 = t.c - t.b;
            super.a.c(n2, t);
            super.a.b(n, 1, n2, 0, (w$a)null);
            return true;
        }
        final int r = t.r();
        if (r == 0 && !this.c) {
            final int n3 = t.c - t.b;
            final byte[] array = new byte[n3];
            t.b(0, n3, array);
            final a$a d = ya.a.d(new s(array, n3), false);
            final n$a n$a = new n$a();
            n$a.k = "audio/mp4a-latm";
            n$a.h = d.c;
            n$a.x = d.b;
            n$a.y = d.a;
            n$a.m = Collections.singletonList(array);
            super.a.a(new n(n$a));
            this.c = true;
            return false;
        }
        if (this.d == 10 && r != 1) {
            return false;
        }
        final int n4 = t.c - t.b;
        super.a.c(n4, t);
        super.a.b(n, 1, n4, 0, (w$a)null);
        return true;
    }
}
