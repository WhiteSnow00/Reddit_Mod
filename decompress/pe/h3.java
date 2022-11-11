// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.io.InputStream;
import java.util.List;
import java.util.Iterator;
import java.net.URLConnection;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import j0.b;
import java.util.Map;
import java.net.URL;

public final class h3 implements Runnable
{
    public final URL f;
    public final byte[] g;
    public final f3 h;
    public final String i;
    public final Map j;
    public final /* synthetic */ j3 k;
    
    public h3(final j3 k, final String i, final URL f, final byte[] g, final b j, final f3 h) {
        this.k = k;
        lw0.b.O(i);
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void run() {
        ((h4)this.k.f).b().Q();
        final OutputStream outputStream = null;
        Object o8 = null;
        final g3 g4;
        Label_0827: {
            Object o9;
            Object o10 = null;
            try {
                final j3 k = this.k;
                final URLConnection openConnection = this.f.openConnection();
                if (openConnection instanceof HttpURLConnection) {
                    Object o = openConnection;
                    ((URLConnection)o).setDefaultUseCaches(false);
                    k.f.getClass();
                    ((URLConnection)o).setConnectTimeout(60000);
                    k.f.getClass();
                    ((URLConnection)o).setReadTimeout(61000);
                    ((HttpURLConnection)o).setInstanceFollowRedirects(false);
                    ((URLConnection)o).setDoInput(true);
                    try {
                        final Map j = this.j;
                        if (j != null) {
                            for (final Map.Entry<String, V> entry : j.entrySet()) {
                                ((URLConnection)o).addRequestProperty(entry.getKey(), (String)entry.getValue());
                            }
                        }
                        if (this.g != null) {
                            final i7 l = this.k.g.l;
                            g7.H((b7)l);
                            final byte[] o2 = l.o0(this.g);
                            final b3 s = ((h4)this.k.f).h().s;
                            final int length = o2.length;
                            s.b((Object)length, "Uploading data. size");
                            ((URLConnection)o).setDoOutput(true);
                            ((URLConnection)o).addRequestProperty("Content-Encoding", "gzip");
                            ((HttpURLConnection)o).setFixedLengthStreamingMode(length);
                            ((URLConnection)o).connect();
                            final OutputStream outputStream2 = ((URLConnection)o).getOutputStream();
                            try {
                                outputStream2.write(o2);
                                outputStream2.close();
                            }
                            catch (final IOException ex) {
                                o = ex;
                            }
                        }
                        final int responseCode = ((HttpURLConnection)o).getResponseCode();
                        try {
                            final Map<String, List<String>> headerFields = ((URLConnection)o).getHeaderFields();
                            InputStream inputStream;
                            byte[] byteArray;
                            try {
                                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = ((URLConnection)o).getInputStream();
                                try {
                                    final byte[] array = new byte[1024];
                                    while (true) {
                                        final int read = inputStream.read(array);
                                        if (read <= 0) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(array, 0, read);
                                    }
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    final InputStream inputStream2 = inputStream;
                                    inputStream2.close();
                                    final HttpURLConnection httpURLConnection = (HttpURLConnection)o;
                                    httpURLConnection.disconnect();
                                    final h3 h3 = this;
                                    final j3 j2 = h3.k;
                                    final Object o3 = j2.f;
                                    final h4 h4 = (h4)o3;
                                    o = h4.b();
                                    final h3 h5 = this;
                                    final String s2 = h5.i;
                                    final h3 h6 = this;
                                    final f3 f3 = h6.h;
                                    final int n = responseCode;
                                    final IOException ex2 = null;
                                    final byte[] array2 = byteArray;
                                    final Map<String, List<String>> map = headerFields;
                                    final Object o4;
                                    final g3 g3 = (g3)(o4 = new g3(s2, f3, n, ex2, array2, map));
                                    final HttpURLConnection httpURLConnection2 = (HttpURLConnection)(o = o4);
                                }
                                finally {
                                    final Object o6;
                                    final Object o5 = o6;
                                }
                            }
                            finally {
                                final Object o7;
                                final Object o5 = o7;
                                inputStream = null;
                            }
                            try {
                                final InputStream inputStream2 = inputStream;
                                inputStream2.close();
                                final HttpURLConnection httpURLConnection = (HttpURLConnection)o;
                                httpURLConnection.disconnect();
                                final h3 h3 = this;
                                final j3 j2 = h3.k;
                                final Object o3 = j2.f;
                                final h4 h4 = (h4)o3;
                                o = h4.b();
                                final h3 h5 = this;
                                final String s2 = h5.i;
                                final h3 h6 = this;
                                final f3 f3 = h6.h;
                                final int n = responseCode;
                                final IOException ex2 = null;
                                final byte[] array2 = byteArray;
                                final Map<String, List<String>> map = headerFields;
                                final g3 g3 = new g3(s2, f3, n, ex2, array2, map);
                                final Object o4 = o = g3;
                                break Label_0827;
                                Label_0468: {
                                    throw;
                                }
                                iftrue(Label_0468:)(inputStream == null);
                                inputStream.close();
                            }
                            catch (final IOException ex3) {}
                            finally {
                                final HttpURLConnection httpURLConnection3;
                                o = httpURLConnection3;
                            }
                        }
                        catch (final IOException ex4) {}
                        finally {
                            final HttpURLConnection httpURLConnection4;
                            o = httpURLConnection4;
                        }
                    }
                    catch (final IOException ex5) {}
                    finally {
                        goto Label_0618;
                    }
                }
                throw new IOException("Failed to obtain HTTP connection");
            }
            catch (final IOException g4) {
                o8 = (o9 = null);
            }
            finally {
                final int n2 = 0;
                o9 = (o8 = null);
                o10 = outputStream;
            }
            try {
                ((OutputStream)o10).close();
                goto Label_0663;
            }
            catch (final IOException ex6) {}
            final int n2 = 0;
            final g4 g5 = null;
            o10 = o8;
            o8 = g5;
            if (o10 != null) {
                try {
                    ((OutputStream)o10).close();
                }
                catch (final IOException ex7) {
                    ((h4)this.k.f).h().k.c((Object)d3.V(this.i), "Error closing HTTP compressed POST connection output stream. appId", (Object)ex7);
                }
            }
            if (o9 != null) {
                ((HttpURLConnection)o9).disconnect();
            }
            final g4 b = ((h4)this.k.f).b();
            g4 = new g3(this.i, this.h, n2, (IOException)g4, null, (Map)o8);
            o8 = b;
        }
        ((g4)o8).U(g4);
    }
}
