// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.io.OutputStream;
import java.util.logging.Logger;
import kotlin.text.b;
import ng2.e;

public final class u
{
    public static final a0 a(final e0 e0) {
        e.f((Object)e0, "<this>");
        return new a0(e0);
    }
    
    public static final b0 b(final g0 g0) {
        e.f((Object)g0, "<this>");
        return new b0(g0);
    }
    
    public static final boolean c(final AssertionError assertionError) {
        final Logger a = v.a;
        final Throwable cause = assertionError.getCause();
        boolean b = false;
        if (cause != null) {
            final String message = assertionError.getMessage();
            final boolean b2 = message != null && kotlin.text.b.J0((CharSequence)message, (CharSequence)"getsockname failed", false);
            b = b;
            if (b2) {
                b = true;
            }
        }
        return b;
    }
    
    public static final x d(final OutputStream outputStream) {
        final Logger a = v.a;
        e.f((Object)outputStream, "<this>");
        return new x(outputStream, new h0());
    }
    
    public static final e0 e(final Socket socket) throws IOException {
        final Logger a = v.a;
        e.f((Object)socket, "<this>");
        final f0 f0 = new f0(socket);
        final OutputStream outputStream = socket.getOutputStream();
        e.e((Object)outputStream, "getOutputStream()");
        return ((a)f0).sink((e0)new x(outputStream, (h0)f0));
    }
    
    public static final q f(final File file) throws FileNotFoundException {
        final Logger a = v.a;
        e.f((Object)file, "<this>");
        return new q((InputStream)new FileInputStream(file), h0.NONE);
    }
    
    public static final q g(final InputStream inputStream) {
        final Logger a = v.a;
        e.f((Object)inputStream, "<this>");
        return new q(inputStream, new h0());
    }
    
    public static final g0 h(final Socket socket) throws IOException {
        final Logger a = v.a;
        e.f((Object)socket, "<this>");
        final f0 f0 = new f0(socket);
        final InputStream inputStream = socket.getInputStream();
        e.e((Object)inputStream, "getInputStream()");
        return ((a)f0).source((g0)new q(inputStream, (h0)f0));
    }
}
