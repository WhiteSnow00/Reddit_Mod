// 
// Decompiled by Procyon v0.6.0
// 

package fi.iki.elonen;

import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.net.SocketTimeoutException;
import java.net.SocketException;
import java.net.Socket;
import java.io.FilterOutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.Date;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.nio.charset.Charset;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.io.IOException;
import java.util.logging.Level;
import java.io.Closeable;
import java.net.ServerSocket;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public abstract class NanoHTTPD
{
    public static final Pattern h;
    public static final Pattern i;
    public static final Pattern j;
    public static final Logger k;
    public final String a;
    public final int b;
    public volatile ServerSocket c;
    public g d;
    public Thread e;
    public a f;
    public p g;
    
    static {
        h = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
        i = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
        j = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
        k = Logger.getLogger(NanoHTTPD.class.getName());
    }
    
    public NanoHTTPD() {
        this.d = new g();
        this.a = "localhost";
        this.b = 0;
        this.g = (p)new NanoHTTPD$j();
        this.f = (a)new NanoHTTPD$f();
    }
    
    public static void a(final Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (final IOException ex) {
                NanoHTTPD.k.log(Level.SEVERE, "Could not close", ex);
            }
        }
    }
    
    public static String b(String decode) {
        try {
            decode = URLDecoder.decode(decode, "UTF8");
        }
        catch (final UnsupportedEncodingException ex) {
            NanoHTTPD.k.log(Level.WARNING, "Encoding not supported, ignored", ex);
            decode = null;
        }
        return decode;
    }
    
    public static Response c(final NanoHTTPD$Response$Status nanoHTTPD$Response$Status, final String s, final String s2) {
        final c c = new c(s);
        if (s2 == null) {
            return new Response(nanoHTTPD$Response$Status, s, new ByteArrayInputStream(new byte[0]), 0L);
        }
        c c2 = c;
        c c3 = c;
        byte[] bytes;
        try {
            if (!Charset.forName(c.a()).newEncoder().canEncode(s2)) {
                c2 = c;
                c3 = c;
                if (c.c == null) {
                    c3 = c;
                    c2 = new(fi.iki.elonen.NanoHTTPD.c.class)();
                    c3 = c;
                    c3 = c;
                    final StringBuilder sb = new StringBuilder();
                    c3 = c;
                    sb.append(s);
                    c3 = c;
                    sb.append("; charset=UTF-8");
                    c3 = c;
                    new c(sb.toString());
                }
            }
            c3 = c2;
            bytes = s2.getBytes(c2.a());
        }
        catch (final UnsupportedEncodingException ex) {
            NanoHTTPD.k.log(Level.SEVERE, "encoding problem, responding nothing", ex);
            bytes = new byte[0];
            c2 = c3;
        }
        return new Response(nanoHTTPD$Response$Status, c2.a, new ByteArrayInputStream(bytes), bytes.length);
    }
    
    public static boolean f(final Response response) {
        final String g = response.g;
        return g != null && (g.toLowerCase().contains("text/") || response.g.toLowerCase().contains("/json"));
    }
    
    public Response d(final l l) {
        final HashMap hashMap = new HashMap();
        final NanoHTTPD$k nanoHTTPD$k = (NanoHTTPD$k)l;
        final Method g = nanoHTTPD$k.g;
        Label_0049: {
            if (!Method.PUT.equals(g)) {
                if (!Method.POST.equals(g)) {
                    break Label_0049;
                }
            }
            try {
                ((NanoHTTPD$k)l).g(hashMap);
                final HashMap hashMap2 = new HashMap();
                for (final String s : nanoHTTPD$k.h.keySet()) {
                    hashMap2.put(s, ((List<Object>)nanoHTTPD$k.h.get(s)).get(0));
                }
                hashMap2.put("NanoHttpd.QUERY_STRING", nanoHTTPD$k.k);
                return c(NanoHTTPD$Response$Status.NOT_FOUND, "text/plain", "Not Found");
            }
            catch (final ResponseException ex) {
                return c(ex.getStatus(), "text/plain", ex.getMessage());
            }
            catch (final IOException ex2) {
                final NanoHTTPD$Response$Status internal_ERROR = NanoHTTPD$Response$Status.INTERNAL_ERROR;
                final StringBuilder t = a.t("SERVER INTERNAL ERROR: IOException: ");
                t.append(ex2.getMessage());
                return c(internal_ERROR, "text/plain", t.toString());
            }
        }
    }
    
    public final void e() throws IOException {
        this.d.getClass();
        (this.c = new ServerSocket()).setReuseAddress(true);
        Object g = new m();
        (this.e = new Thread((Runnable)g)).setDaemon(true);
        this.e.setName("NanoHttpd Main Listener");
        this.e.start();
        while (true) {
            Label_0095: {
                if (((m)g).h || ((m)g).g != null) {
                    break Label_0095;
                }
                try {
                    Thread.sleep(10L);
                    return;
                    Label_0105: {
                        throw g;
                    }
                    g = ((m)g).g;
                    iftrue(Label_0105:)(g != null);
                }
                finally {}
            }
        }
    }
    
    public enum Method
    {
        private static final Method[] $VALUES;
        
        CONNECT, 
        COPY, 
        DELETE, 
        GET, 
        HEAD, 
        LOCK, 
        MKCOL, 
        MOVE, 
        OPTIONS, 
        PATCH, 
        POST, 
        PROPFIND, 
        PROPPATCH, 
        PUT, 
        TRACE, 
        UNLOCK;
        
        public static Method lookup(final String s) {
            if (s == null) {
                return null;
            }
            try {
                return valueOf(s);
            }
            catch (final IllegalArgumentException ex) {
                return null;
            }
        }
    }
    
    public static final class Response implements Closeable
    {
        public b f;
        public String g;
        public InputStream h;
        public long i;
        public final Map<String, String> j;
        public final HashMap k;
        public Method l;
        public boolean m;
        public boolean n;
        public boolean o;
        
        public Response(final NanoHTTPD$Response$Status f, final String g, final ByteArrayInputStream h, final long i) {
            this.j = new HashMap<String, String>(this) {
                public final Response this$0;
                
                @Override
                public /* bridge */ Object put(final Object o, final Object o2) {
                    return this.put((String)o, (String)o2);
                }
                
                @Override
                public String put(final String s, final String s2) {
                    final HashMap k = this.this$0.k;
                    String lowerCase;
                    if (s == null) {
                        lowerCase = s;
                    }
                    else {
                        lowerCase = s.toLowerCase();
                    }
                    k.put(lowerCase, s2);
                    return super.put(s, s2);
                }
            };
            this.k = new HashMap();
            this.f = (b)f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.m = (i < 0L);
            this.o = true;
        }
        
        public static void j(final PrintWriter printWriter, final String s, final String s2) {
            printWriter.append(s).append(": ").append(s2).append("\r\n");
        }
        
        public final String b(final String s) {
            return this.k.get(s.toLowerCase());
        }
        
        @Override
        public final void close() throws IOException {
            try (final InputStream h = this.h) {}
        }
        
        public final boolean h() {
            return "close".equals(this.b("connection"));
        }
        
        public final void k(final OutputStream outputStream) {
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            Label_0544: {
                Label_0517: {
                    long n = 0L;
                    Label_0475: {
                        a a = null;
                        Label_0467: {
                            try {
                                if (this.f == null) {
                                    throw new Error("sendResponse(): Status can't be null.");
                                }
                                final PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream, new c(this.g).a())), false);
                                printWriter.append("HTTP/1.1 ").append(this.f.getDescription()).append(" \r\n");
                                final String g = this.g;
                                if (g != null) {
                                    j(printWriter, "Content-Type", g);
                                }
                                if (this.b("date") == null) {
                                    j(printWriter, "Date", simpleDateFormat.format(new Date()));
                                }
                                for (final Map.Entry<String, V> entry : ((HashMap)this.j).entrySet()) {
                                    j(printWriter, entry.getKey(), (String)entry.getValue());
                                }
                                if (this.b("connection") == null) {
                                    String s;
                                    if (this.o) {
                                        s = "keep-alive";
                                    }
                                    else {
                                        s = "close";
                                    }
                                    j(printWriter, "Connection", s);
                                }
                                if (this.b("content-length") != null) {
                                    this.n = false;
                                }
                                if (this.n) {
                                    j(printWriter, "Content-Encoding", "gzip");
                                    this.m = true;
                                }
                                long i;
                                if (this.h != null) {
                                    i = this.i;
                                }
                                else {
                                    i = 0L;
                                }
                                final Method l = this.l;
                                final Method head = Method.HEAD;
                                if (l != head && this.m) {
                                    j(printWriter, "Transfer-Encoding", "chunked");
                                    n = i;
                                }
                                else {
                                    n = i;
                                    if (!this.n) {
                                        n = this.n(i, printWriter);
                                    }
                                }
                                printWriter.append("\r\n");
                                printWriter.flush();
                                if (this.l == head || !this.m) {
                                    break Label_0475;
                                }
                                a = new a(outputStream);
                                if (this.n) {
                                    final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(a);
                                    this.l(gzipOutputStream, -1L);
                                    gzipOutputStream.finish();
                                    break Label_0467;
                                }
                            }
                            catch (final IOException ex) {
                                break Label_0544;
                            }
                            this.l(a, -1L);
                        }
                        a.b();
                        break Label_0517;
                    }
                    if (this.n) {
                        final GZIPOutputStream gzipOutputStream2 = new GZIPOutputStream(outputStream);
                        this.l(gzipOutputStream2, -1L);
                        gzipOutputStream2.finish();
                    }
                    else {
                        this.l(outputStream, n);
                    }
                }
                outputStream.flush();
                NanoHTTPD.a(this.h);
                return;
            }
            final IOException ex;
            NanoHTTPD.k.log(Level.SEVERE, "Could not send response to the client", ex);
        }
        
        public final void l(final OutputStream outputStream, long n) throws IOException {
            final byte[] array = new byte[(int)16384L];
            final boolean b = n == -1L;
            while (n > 0L || b) {
                long min;
                if (b) {
                    min = 16384L;
                }
                else {
                    min = Math.min(n, 16384L);
                }
                final int read = this.h.read(array, 0, (int)min);
                if (read <= 0) {
                    break;
                }
                outputStream.write(array, 0, read);
                if (b) {
                    continue;
                }
                n -= read;
            }
        }
        
        public final long n(final long n, final PrintWriter printWriter) {
            final String b = this.b("content-length");
            long long1 = n;
            if (b != null) {
                try {
                    long1 = Long.parseLong(b);
                }
                catch (final NumberFormatException ex) {
                    final Logger k = NanoHTTPD.k;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("content-length was no number ");
                    sb.append(b);
                    k.severe(sb.toString());
                    long1 = n;
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Content-Length: ");
            sb2.append(long1);
            sb2.append("\r\n");
            printWriter.print(sb2.toString());
            return long1;
        }
        
        public final void o(final boolean n) {
            this.n = n;
        }
        
        public final void p(final boolean o) {
            this.o = o;
        }
        
        public final void q(final Method l) {
            this.l = l;
        }
        
        public static final class a extends FilterOutputStream
        {
            public a(final OutputStream outputStream) {
                super(outputStream);
            }
            
            public final void b() throws IOException {
                super.out.write("0\r\n\r\n".getBytes());
            }
            
            @Override
            public final void write(final int n) throws IOException {
                this.write(new byte[] { (byte)n }, 0, 1);
            }
            
            @Override
            public final void write(final byte[] array) throws IOException {
                this.write(array, 0, array.length);
            }
            
            @Override
            public final void write(final byte[] array, final int n, final int n2) throws IOException {
                if (n2 == 0) {
                    return;
                }
                super.out.write(String.format("%x\r\n", n2).getBytes());
                super.out.write(array, n, n2);
                super.out.write("\r\n".getBytes());
            }
        }
        
        public interface b
        {
            String getDescription();
        }
    }
    
    public static final class ResponseException extends Exception
    {
        private static final long serialVersionUID = 6569838532917408380L;
        private final NanoHTTPD$Response$Status status;
        
        public ResponseException(final NanoHTTPD$Response$Status status, final String s) {
            super(s);
            this.status = status;
        }
        
        public ResponseException(final NanoHTTPD$Response$Status status, final String s, final Exception ex) {
            super(s, ex);
            this.status = status;
        }
        
        public NanoHTTPD$Response$Status getStatus() {
            return this.status;
        }
    }
    
    public interface a
    {
    }
    
    public final class b implements Runnable
    {
        public final InputStream f;
        public final Socket g;
        public final NanoHTTPD h;
        
        public b(final NanoHTTPD h, final InputStream f, final Socket g) {
            this.h = h;
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final void run() {
            Closeable outputStream = null;
            Object o = null;
            Label_0173: {
                try {
                    try {
                        final OutputStream outputStream2 = (OutputStream)(outputStream = this.g.getOutputStream());
                        ((NanoHTTPD$j)this.h.g).getClass();
                        outputStream = outputStream2;
                        o = new(fi.iki.elonen.NanoHTTPD$i.class)();
                        outputStream = outputStream2;
                        new NanoHTTPD$i();
                        outputStream = outputStream2;
                        outputStream = outputStream2;
                        final NanoHTTPD$k nanoHTTPD$k = new NanoHTTPD$k(this.h, (NanoHTTPD$i)o, this.f, outputStream2, this.g.getInetAddress());
                        while (true) {
                            outputStream = outputStream2;
                            o = outputStream2;
                            if (this.g.isClosed()) {}
                            outputStream = outputStream2;
                            nanoHTTPD$k.d();
                        }
                    }
                    finally {}
                }
                catch (final Exception ex) {
                    final NanoHTTPD$i nanoHTTPD$i;
                    if (ex instanceof SocketException) {
                        o = nanoHTTPD$i;
                        if ("NanoHttpd Shutdown".equals(ex.getMessage())) {
                            break Label_0173;
                        }
                    }
                    o = nanoHTTPD$i;
                    if (!(ex instanceof SocketTimeoutException)) {
                        NanoHTTPD.k.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", ex);
                        o = nanoHTTPD$i;
                    }
                }
            }
            NanoHTTPD.a((Closeable)o);
            NanoHTTPD.a(this.f);
            NanoHTTPD.a(this.g);
            ((NanoHTTPD$f)this.h.f).a(this);
            return;
            NanoHTTPD.a(outputStream);
            NanoHTTPD.a(this.f);
            NanoHTTPD.a(this.g);
            ((NanoHTTPD$f)this.h.f).a(this);
        }
    }
    
    public static final class c
    {
        public static final Pattern e;
        public static final Pattern f;
        public static final Pattern g;
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        
        static {
            e = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
            f = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
            g = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
        }
        
        public c(String group) {
            this.a = group;
            String group2 = "";
            final String s = null;
            if (group != null) {
                final Matcher matcher = c.e.matcher(group);
                if (matcher.find()) {
                    group2 = matcher.group(1);
                }
                this.b = group2;
                final Matcher matcher2 = c.f.matcher(group);
                String group3;
                if (matcher2.find()) {
                    group3 = matcher2.group(2);
                }
                else {
                    group3 = null;
                }
                this.c = group3;
            }
            else {
                this.b = "";
                this.c = "UTF-8";
            }
            if ("multipart/form-data".equalsIgnoreCase(this.b)) {
                final Matcher matcher3 = c.g.matcher(group);
                group = s;
                if (matcher3.find()) {
                    group = matcher3.group(2);
                }
                this.d = group;
            }
            else {
                this.d = null;
            }
        }
        
        public final String a() {
            String c;
            if ((c = this.c) == null) {
                c = "US-ASCII";
            }
            return c;
        }
    }
    
    public static final class d
    {
    }
    
    public final class e implements Iterable<String>
    {
        public final HashMap<String, String> f;
        public final ArrayList<d> g;
        
        public e(final Map map) {
            this.f = new HashMap<String, String>();
            this.g = new ArrayList<d>();
            final String s = map.get("cookie");
            if (s != null) {
                final String[] split = s.split(";");
                for (int length = split.length, i = 0; i < length; ++i) {
                    final String[] split2 = split[i].trim().split("=");
                    if (split2.length == 2) {
                        this.f.put(split2[0], split2[1]);
                    }
                }
            }
        }
        
        public final void a(final Response response) {
            final Iterator<d> iterator = this.g.iterator();
            while (iterator.hasNext()) {
                iterator.next().getClass();
                response.j.put("Set-Cookie", String.format("%s=%s; expires=%s", null, null, null));
            }
        }
        
        @Override
        public final Iterator<String> iterator() {
            return this.f.keySet().iterator();
        }
    }
    
    public static final class g
    {
    }
    
    public interface l
    {
    }
    
    public final class m implements Runnable
    {
        public final int f;
        public IOException g;
        public boolean h;
        public final NanoHTTPD i;
        
        public m(final NanoHTTPD i) {
            this.i = i;
            this.h = false;
            this.f = 5000;
        }
        
        @Override
        public final void run() {
            try {
                final ServerSocket c = this.i.c;
                InetSocketAddress inetSocketAddress;
                if (this.i.a != null) {
                    inetSocketAddress = new(java.net.InetSocketAddress.class)();
                    final NanoHTTPD i = this.i;
                    new InetSocketAddress(i.a, i.b);
                }
                else {
                    inetSocketAddress = new InetSocketAddress(this.i.b);
                }
                c.bind(inetSocketAddress);
                this.h = true;
                do {
                    try {
                        final Socket accept = this.i.c.accept();
                        final int f = this.f;
                        if (f > 0) {
                            accept.setSoTimeout(f);
                        }
                        final InputStream inputStream = accept.getInputStream();
                        final NanoHTTPD j = this.i;
                        final a f2 = j.f;
                        j.getClass();
                        ((NanoHTTPD$f)f2).b(j.new b(inputStream, accept));
                    }
                    catch (final IOException ex) {
                        NanoHTTPD.k.log(Level.FINE, "Communication with the client broken", ex);
                    }
                } while (!this.i.c.isClosed());
            }
            catch (final IOException g) {
                this.g = g;
            }
        }
    }
    
    public interface n
    {
        void delete() throws Exception;
    }
    
    public interface o
    {
    }
    
    public interface p
    {
    }
}
