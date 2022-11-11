// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.rtsp;

import java.util.Objects;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.OutputStream;
import java.util.regex.Matcher;
import com.google.android.exoplayer2.ParserException;
import java.util.Collection;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import rg.e;
import ad.d0;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import rg.b;
import java.net.Socket;
import java.util.Map;
import com.google.android.exoplayer2.upstream.Loader;
import java.nio.charset.Charset;
import java.io.Closeable;

public final class g implements Closeable
{
    public static final Charset l;
    public final c f;
    public final Loader g;
    public final Map<Integer, a> h;
    public f i;
    public Socket j;
    public volatile boolean k;
    
    static {
        l = b.c;
    }
    
    public g(final d$b f) {
        this.f = (c)f;
        this.g = new Loader("ExoPlayer:RtspMessageChannel:ReceiverLoader");
        this.h = Collections.synchronizedMap(new HashMap<Integer, a>());
    }
    
    public final void a(final Socket j) throws IOException {
        this.j = j;
        this.i = new f(j.getOutputStream());
        this.g.f(new g.g$e(this, j.getInputStream()), (Loader.a<g.g$e>)new g.g$b(this), 0);
    }
    
    public final void b(final ImmutableList list) {
        d0.g(this.i);
        final f i = this.i;
        i.getClass();
        i.h.post((Runnable)new jc.h(i, 0, new e(com.google.android.exoplayer2.source.rtsp.h.h).b((Iterable)list).getBytes(com.google.android.exoplayer2.source.rtsp.g.l), list));
    }
    
    @Override
    public final void close() throws IOException {
        if (this.k) {
            return;
        }
        try {
            try (final f i = this.i) {}
            this.g.e(null);
            try (final Socket j = this.j) {}
        }
        finally {
            this.k = true;
        }
    }
    
    public interface a
    {
        void j(final byte[] p0);
    }
    
    public interface c
    {
    }
    
    public static final class d
    {
        public final ArrayList a;
        public int b;
        public long c;
        
        public d() {
            this.a = new ArrayList();
            this.b = 1;
        }
        
        public static byte[] b(final byte b, final DataInputStream dataInputStream) throws IOException {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final byte[] array = { b, dataInputStream.readByte() };
            byteArrayOutputStream.write(array);
            while (array[0] != 13 || array[1] != 10) {
                array[0] = array[1];
                final byte byte1 = dataInputStream.readByte();
                array[1] = byte1;
                byteArrayOutputStream.write(byte1);
            }
            return byteArrayOutputStream.toByteArray();
        }
        
        public final ImmutableList<String> a(byte[] copy) throws ParserException {
            final int length = copy.length;
            final boolean b = true;
            d0.c(length >= 2 && copy[copy.length - 2] == 13 && copy[copy.length - 1] == 10);
            copy = (byte[])(Object)new String(copy, 0, copy.length - 2, com.google.android.exoplayer2.source.rtsp.g.l);
            this.a.add(copy);
            final int b2 = this.b;
            if (b2 != 1) {
                if (b2 == 2) {
                    try {
                        final Matcher matcher = com.google.android.exoplayer2.source.rtsp.h.c.matcher((CharSequence)(Object)copy);
                        long long1;
                        if (matcher.find()) {
                            final String group = matcher.group(1);
                            group.getClass();
                            long1 = Long.parseLong(group);
                        }
                        else {
                            long1 = -1L;
                        }
                        if (long1 != -1L) {
                            this.c = long1;
                        }
                        if (!((String)(Object)copy).isEmpty()) {
                            return null;
                        }
                        if (this.c > 0L) {
                            this.b = 3;
                            return null;
                        }
                        copy = (byte[])(Object)ImmutableList.copyOf((Collection)this.a);
                        this.a.clear();
                        this.b = 1;
                        this.c = 0L;
                        return (ImmutableList<String>)(Object)copy;
                    }
                    catch (final NumberFormatException ex) {
                        throw ParserException.createForMalformedManifest((String)(Object)copy, ex);
                    }
                }
                throw new IllegalStateException();
            }
            int n = b ? 1 : 0;
            if (!com.google.android.exoplayer2.source.rtsp.h.a.matcher((CharSequence)(Object)copy).matches()) {
                if (com.google.android.exoplayer2.source.rtsp.h.b.matcher((CharSequence)(Object)copy).matches()) {
                    n = (b ? 1 : 0);
                }
                else {
                    n = 0;
                }
            }
            if (n != 0) {
                this.b = 2;
            }
            return null;
        }
    }
    
    public final class f implements Closeable
    {
        public final OutputStream f;
        public final HandlerThread g;
        public final Handler h;
        
        public f(final OutputStream f) {
            this.f = f;
            final HandlerThread g = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            ((Thread)(this.g = g)).start();
            this.h = new Handler(g.getLooper());
        }
        
        @Override
        public final void close() {
            final Handler h = this.h;
            final HandlerThread g = this.g;
            Objects.requireNonNull(g);
            h.post((Runnable)new h.e((Object)g, 4));
            try {
                ((Thread)this.g).join();
            }
            catch (final InterruptedException ex) {
                ((Thread)this.g).interrupt();
            }
        }
    }
}
