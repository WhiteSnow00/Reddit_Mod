// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import ml0.a;
import java.io.InputStream;
import java.nio.ByteOrder;
import al0.b;
import al0.g7;
import android.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import com.bumptech.glide.load.ImageHeaderParser;

public final class DefaultImageHeaderParser implements ImageHeaderParser
{
    public static final byte[] a;
    public static final int[] b;
    
    static {
        a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
        b = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8 };
    }
    
    public static ImageType d(final Reader reader) throws IOException {
        try {
            final int a = reader.a();
            if (a == 65496) {
                return ImageType.JPEG;
            }
            final int n = a << 8 | reader.b();
            if (n == 4671814) {
                return ImageType.GIF;
            }
            final int n2 = n << 8 | reader.b();
            if (n2 == -1991225785) {
                reader.skip(21L);
                try {
                    ImageType imageType;
                    if (reader.b() >= 3) {
                        imageType = ImageType.PNG_A;
                    }
                    else {
                        imageType = ImageType.PNG;
                    }
                    return imageType;
                }
                catch (final EndOfFileException ex) {
                    return ImageType.PNG;
                }
            }
            if (n2 != 1380533830) {
                return ImageType.UNKNOWN;
            }
            reader.skip(4L);
            if ((reader.a() << 16 | reader.a()) != 0x57454250) {
                return ImageType.UNKNOWN;
            }
            final int n3 = reader.a() << 16 | reader.a();
            if ((n3 & 0xFFFFFF00) != 0x56503800) {
                return ImageType.UNKNOWN;
            }
            final int n4 = n3 & 0xFF;
            if (n4 == 88) {
                reader.skip(4L);
                ImageType imageType2;
                if ((reader.b() & 0x10) != 0x0) {
                    imageType2 = ImageType.WEBP_A;
                }
                else {
                    imageType2 = ImageType.WEBP;
                }
                return imageType2;
            }
            if (n4 == 76) {
                reader.skip(4L);
                ImageType imageType3;
                if ((reader.b() & 0x8) != 0x0) {
                    imageType3 = ImageType.WEBP_A;
                }
                else {
                    imageType3 = ImageType.WEBP;
                }
                return imageType3;
            }
            return ImageType.WEBP;
        }
        catch (final EndOfFileException ex2) {
            return ImageType.UNKNOWN;
        }
    }
    
    public static int e(final c c) throws IOException {
        long skip;
        long n;
        short b2;
        int n2;
        do {
            final short b = c.b();
            if (b != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    g7.v("Unknown segmentId=", (int)b, "DfltImageHeaderParser");
                }
                return -1;
            }
            b2 = c.b();
            if (b2 == 218) {
                return -1;
            }
            if (b2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            n2 = c.a() - 2;
            if (b2 == 225) {
                return n2;
            }
            n = n2;
            skip = c.skip(n);
        } while (skip == n);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            final StringBuilder j = al0.b.j("Unable to skip enough data, type: ", (int)b2, ", wanted to skip: ", n2, ", but actually skipped: ");
            j.append(skip);
            Log.d("DfltImageHeaderParser", j.toString());
        }
        return -1;
    }
    
    public static int f(final c c, final byte[] array, int n) throws IOException {
        final int c2 = c.c(n, array);
        final int n2 = -1;
        if (c2 != n) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(n);
                sb.append(", actually read: ");
                sb.append(c2);
                Log.d("DfltImageHeaderParser", sb.toString());
            }
            return -1;
        }
        boolean b2;
        final boolean b = b2 = (array != null && n > DefaultImageHeaderParser.a.length);
        if (b) {
            int n3 = 0;
            while (true) {
                final byte[] a = DefaultImageHeaderParser.a;
                b2 = b;
                if (n3 >= a.length) {
                    break;
                }
                if (array[n3] != a[n3]) {
                    b2 = false;
                    break;
                }
                ++n3;
            }
        }
        if (b2) {
            final b b3 = new b(array, n);
            n = b3.a(6);
            ByteOrder byteOrder;
            if (n != 18761) {
                if (n != 19789) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        g7.v("Unknown endianness = ", n, "DfltImageHeaderParser");
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
                else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
            }
            else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            b3.a.order(byteOrder);
            if (b3.a.remaining() - 10 >= 4) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                n = b3.a.getInt(10);
            }
            else {
                n = -1;
            }
            final int n4 = n + 6;
            final short a2 = b3.a(n4);
            n = 0;
            int a3;
            while (true) {
                a3 = n2;
                if (n >= a2) {
                    break;
                }
                final int n5 = n * 12 + (n4 + 2);
                final short a4 = b3.a(n5);
                if (a4 == 274) {
                    final short a5 = b3.a(n5 + 2);
                    if (a5 >= 1 && a5 <= 12) {
                        final int n6 = n5 + 4;
                        int int1;
                        if (b3.a.remaining() - n6 >= 4) {
                            int1 = b3.a.getInt(n6);
                        }
                        else {
                            int1 = -1;
                        }
                        if (int1 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        }
                        else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                final StringBuilder j = al0.b.j("Got tagIndex=", n, " tagType=", (int)a4, " formatCode=");
                                j.append(a5);
                                j.append(" componentCount=");
                                j.append(int1);
                                Log.d("DfltImageHeaderParser", j.toString());
                            }
                            final int n7 = int1 + DefaultImageHeaderParser.b[a5];
                            if (n7 > 4) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    g7.v("Got byte count > 4, not orientation, continuing, formatCode=", (int)a5, "DfltImageHeaderParser");
                                }
                            }
                            else {
                                final int n8 = n5 + 8;
                                if (n8 >= 0 && n8 <= b3.a.remaining()) {
                                    if (n7 >= 0 && n7 + n8 <= b3.a.remaining()) {
                                        a3 = b3.a(n8);
                                        break;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        g7.v("Illegal number of bytes for TI tag data tagType=", (int)a4, "DfltImageHeaderParser");
                                    }
                                }
                                else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Illegal tagValueOffset=");
                                    sb2.append(n8);
                                    sb2.append(" tagType=");
                                    sb2.append(a4);
                                    Log.d("DfltImageHeaderParser", sb2.toString());
                                }
                            }
                        }
                    }
                    else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        g7.v("Got invalid format code = ", (int)a5, "DfltImageHeaderParser");
                    }
                }
                ++n;
            }
            return a3;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }
    
    @Override
    public final ImageType a(final InputStream inputStream) throws IOException {
        ml0.a.l((Object)inputStream);
        return d((Reader)new c(inputStream));
    }
    
    @Override
    public final ImageType b(final ByteBuffer byteBuffer) throws IOException {
        ml0.a.l((Object)byteBuffer);
        return d((Reader)new a(byteBuffer));
    }
    
    @Override
    public final int c(InputStream inputStream, final r8.b b) throws IOException {
        ml0.a.l((Object)inputStream);
        final c c = new c(inputStream);
        ml0.a.l((Object)b);
        final int n = -1;
        try {
            final int a = c.a();
            int n2;
            if ((a & 0xFFD8) != 0xFFD8 && a != 19789 && a != 18761) {
                n2 = n;
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Parser doesn't handle magic number: ");
                    sb.append(a);
                    Log.d("DfltImageHeaderParser", sb.toString());
                    n2 = n;
                }
            }
            else {
                n2 = e(c);
                if (n2 == -1) {
                    n2 = n;
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                        n2 = n;
                    }
                }
                else {
                    inputStream = (InputStream)b.b((Class)byte[].class, n2);
                    try {
                        n2 = f(c, (byte[])(Object)inputStream, n2);
                    }
                    finally {
                        b.a((Object)inputStream);
                    }
                }
            }
            return n2;
        }
        catch (final EndOfFileException ex) {
            return n;
        }
    }
    
    public interface Reader
    {
        int a() throws IOException;
        
        short b() throws IOException;
        
        long skip(final long p0) throws IOException;
        
        public static final class EndOfFileException extends IOException
        {
            private static final long serialVersionUID = 1L;
            
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }
    }
    
    public static final class a implements Reader
    {
        public final ByteBuffer a;
        
        public a(final ByteBuffer a) {
            (this.a = a).order(ByteOrder.BIG_ENDIAN);
        }
        
        @Override
        public final int a() throws EndOfFileException {
            return this.b() << 8 | this.b();
        }
        
        @Override
        public final short b() throws EndOfFileException {
            if (this.a.remaining() >= 1) {
                return (short)(this.a.get() & 0xFF);
            }
            throw new EndOfFileException();
        }
        
        @Override
        public final long skip(final long n) {
            final int n2 = (int)Math.min(this.a.remaining(), n);
            final ByteBuffer a = this.a;
            a.position(a.position() + n2);
            return n2;
        }
    }
    
    public static final class b
    {
        public final ByteBuffer a;
        
        public b(final byte[] array, final int n) {
            this.a = (ByteBuffer)ByteBuffer.wrap(array).order(ByteOrder.BIG_ENDIAN).limit(n);
        }
        
        public final short a(int n) {
            short short1;
            if (this.a.remaining() - n >= 2) {
                n = (short1 = this.a.getShort(n));
            }
            else {
                n = (short1 = -1);
            }
            return short1;
        }
    }
    
    public static final class c implements Reader
    {
        public final InputStream a;
        
        public c(final InputStream a) {
            this.a = a;
        }
        
        @Override
        public final int a() throws IOException {
            return this.b() << 8 | this.b();
        }
        
        @Override
        public final short b() throws IOException {
            final int read = this.a.read();
            if (read != -1) {
                return (short)read;
            }
            throw new EndOfFileException();
        }
        
        public final int c(final int n, final byte[] array) throws IOException {
            int n2 = 0;
            int read = 0;
            int n3;
            while (true) {
                n3 = read;
                if (n2 >= n) {
                    break;
                }
                read = this.a.read(array, n2, n - n2);
                if ((n3 = read) == -1) {
                    break;
                }
                n2 += read;
            }
            if (n2 == 0 && n3 == -1) {
                throw new EndOfFileException();
            }
            return n2;
        }
        
        @Override
        public final long skip(final long n) throws IOException {
            if (n < 0L) {
                return 0L;
            }
            long n2;
            long skip;
            for (n2 = n; n2 > 0L; n2 -= skip) {
                skip = this.a.skip(n2);
                if (skip <= 0L) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1L;
                }
            }
            return n - n2;
        }
    }
}
