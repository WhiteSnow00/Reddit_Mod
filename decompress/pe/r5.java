// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.io.InputStream;
import java.util.List;
import java.net.URLConnection;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.util.Map;
import java.io.IOException;
import lw0.b;
import androidx.lifecycle.w;
import java.net.URL;

public final class r5 implements Runnable
{
    public final URL f;
    public final /* synthetic */ s5 g;
    public final w h;
    
    public r5(final s5 g, final String s, final URL f, final w h) {
        this.g = g;
        b.O(s);
        this.f = f;
        this.h = h;
    }
    
    public final void a(final int n, final IOException ex, final byte[] array, final Map map) {
        ((h4)this.g.f).b().U(new q5(this, n, ex, array, map));
    }
    
    @Override
    public final void run() {
        ((h4)this.g.f).b().Q();
        HttpURLConnection httpURLConnection3 = null;
        Label_0267: {
            try {
                final s5 g = this.g;
                final URLConnection openConnection = this.f.openConnection();
                if (openConnection instanceof HttpURLConnection) {
                    final HttpURLConnection httpURLConnection = (HttpURLConnection)openConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    g.f.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    g.f.getClass();
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        final int responseCode = httpURLConnection.getResponseCode();
                        try {
                            final Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            InputStream inputStream;
                            byte[] byteArray;
                            try {
                                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
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
                                    final HttpURLConnection httpURLConnection2 = httpURLConnection;
                                    httpURLConnection2.disconnect();
                                    final r5 r5 = this;
                                    final int n = responseCode;
                                    final IOException ex = null;
                                    final byte[] array2 = byteArray;
                                    final Map<String, List<String>> map = headerFields;
                                    r5.a(n, ex, array2, map);
                                    return;
                                }
                                finally {
                                    final Object o2;
                                    final Object o = o2;
                                }
                            }
                            finally {
                                final Object o3;
                                final Object o = o3;
                                inputStream = null;
                            }
                            try {
                                final InputStream inputStream2 = inputStream;
                                inputStream2.close();
                                final HttpURLConnection httpURLConnection2 = httpURLConnection;
                                httpURLConnection2.disconnect();
                                final r5 r5 = this;
                                final int n = responseCode;
                                final IOException ex = null;
                                final byte[] array2 = byteArray;
                                final Map<String, List<String>> map = headerFields;
                                r5.a(n, ex, array2, map);
                                return;
                                iftrue(Label_0192:)(inputStream == null);
                                Block_20: {
                                    break Block_20;
                                    Label_0192: {
                                        throw;
                                    }
                                }
                                inputStream.close();
                            }
                            catch (final IOException ex2) {}
                        }
                        catch (final IOException ex3) {}
                    }
                    catch (final IOException ex4) {
                        break Label_0267;
                    }
                    finally {
                        goto Label_0240;
                    }
                }
                throw new IOException("Failed to obtain HTTP connection");
            }
            catch (final IOException ex5) {
                httpURLConnection3 = null;
            }
            finally {
                httpURLConnection3 = null;
            }
        }
        final Map<String, List<String>> headerFields = null;
        final int responseCode = 0;
        if (httpURLConnection3 != null) {
            httpURLConnection3.disconnect();
        }
        final IOException ex5;
        this.a(responseCode, ex5, null, headerFields);
    }
}
