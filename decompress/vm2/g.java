// 
// Decompiled by Procyon v0.6.0
// 

package vm2;

import java.io.Closeable;
import java.io.Reader;
import org.xml.sax.Locator;
import java.io.UnsupportedEncodingException;
import java.io.InputStreamReader;
import java.io.InputStream;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import java.net.URLConnection;
import org.xml.sax.InputSource;
import java.io.IOException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXException;
import java.util.HashMap;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.ContentHandler;
import cd.c;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public final class g extends DefaultHandler implements h, XMLReader, LexicalHandler
{
    public static char[] D;
    public c A;
    public c B;
    public boolean C;
    public ContentHandler a;
    public LexicalHandler b;
    public DTDHandler c;
    public ErrorHandler d;
    public EntityResolver e;
    public j f;
    public i g;
    public b h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public HashMap r;
    public c s;
    public String t;
    public boolean u;
    public String v;
    public String w;
    public String x;
    public String y;
    public c z;
    
    static {
        g.D = new char[] { '<', '/', '>' };
    }
    
    public g() {
        this.a = this;
        this.b = this;
        this.c = this;
        this.d = this;
        this.e = this;
        this.i = true;
        this.j = false;
        this.k = false;
        this.l = true;
        this.m = true;
        this.n = false;
        this.o = true;
        this.p = false;
        this.q = true;
        (this.r = new HashMap()).put("http://xml.org/sax/features/namespaces", r(true));
        final HashMap r = this.r;
        final Boolean false = Boolean.FALSE;
        r.put("http://xml.org/sax/features/namespace-prefixes", false);
        this.r.put("http://xml.org/sax/features/external-general-entities", false);
        this.r.put("http://xml.org/sax/features/external-parameter-entities", false);
        this.r.put("http://xml.org/sax/features/is-standalone", false);
        this.r.put("http://xml.org/sax/features/lexical-handler/parameter-entities", false);
        final HashMap r2 = this.r;
        final Boolean true = Boolean.TRUE;
        r2.put("http://xml.org/sax/features/resolve-dtd-uris", true);
        this.r.put("http://xml.org/sax/features/string-interning", true);
        this.r.put("http://xml.org/sax/features/use-attributes2", false);
        this.r.put("http://xml.org/sax/features/use-locator2", false);
        this.r.put("http://xml.org/sax/features/use-entity-resolver2", false);
        this.r.put("http://xml.org/sax/features/validation", false);
        this.r.put("http://xml.org/sax/features/xmlns-uris", false);
        this.r.put("http://xml.org/sax/features/xmlns-uris", false);
        this.r.put("http://xml.org/sax/features/xml-1.1", false);
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons", r(false));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/bogons-empty", r(false));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/root-bogons", r(true));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/default-attributes", r(true));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/translate-colons", r(false));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/restart-elements", r(true));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace", r(false));
        this.r.put("http://www.ccil.org/~cowan/tagsoup/features/cdata-elements", r(true));
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = true;
    }
    
    public static String k(String substring) {
        final int index = substring.indexOf(58);
        if (index != -1) {
            substring = substring.substring(0, index);
        }
        else {
            substring = "";
        }
        return substring;
    }
    
    public static String q(final String s) {
        if (s == null) {
            return s;
        }
        final int length = s.length();
        if (length == 0) {
            return s;
        }
        final char char1 = s.charAt(0);
        String substring = s;
        if (char1 == s.charAt(length - 1)) {
            if (char1 != '\'') {
                substring = s;
                if (char1 != '\"') {
                    return substring;
                }
            }
            substring = s.substring(1, s.length() - 1);
        }
        return substring;
    }
    
    public static Boolean r(final boolean b) {
        Boolean b2;
        if (b) {
            b2 = Boolean.TRUE;
        }
        else {
            b2 = Boolean.FALSE;
        }
        return b2;
    }
    
    public final void a() throws SAXException {
        final c s = this.s;
        if (s != null) {
            final String t = this.t;
            if (t != null) {
                ((vm2.c)s.b).c((a)s.c, t, (String)null, t);
                this.t = null;
            }
        }
    }
    
    public final void b(final char[] array, int n) throws SAXException {
        if (this.s != null) {
            if (this.t != null) {
                final String s = new String(array, 0, n);
                final int length = s.length();
                final char[] array2 = new char[length];
                int n2;
                int i = n2 = 0;
                n = -1;
                while (i < length) {
                    final char char1 = s.charAt(i);
                    int n3 = n2 + 1;
                    array2[n2] = char1;
                    Label_0250: {
                        if (char1 == '&' && n == -1) {
                            n = n3;
                        }
                        else {
                            int n4;
                            if (n == -1) {
                                n4 = n;
                            }
                            else {
                                n4 = n;
                                if (!Character.isLetter(char1)) {
                                    n4 = n;
                                    if (!Character.isDigit(char1)) {
                                        if (char1 == '#') {
                                            n4 = n;
                                        }
                                        else {
                                            if (char1 == ';') {
                                                final int f = this.f(array2, n, n3 - n - 1);
                                                if (f > 65535) {
                                                    final int n5 = f - 65536;
                                                    array2[n - 1] = (char)((n5 >> 10) + 55296);
                                                    array2[n] = (char)((n5 & 0x3FF) + 56320);
                                                    ++n;
                                                }
                                                else if (f != 0) {
                                                    array2[n - 1] = (char)f;
                                                }
                                                else {
                                                    n = n3;
                                                }
                                                final int n6 = -1;
                                                n3 = n;
                                                n = n6;
                                                break Label_0250;
                                            }
                                            n4 = -1;
                                        }
                                    }
                                }
                            }
                            n = n4;
                        }
                    }
                    ++i;
                    n2 = n3;
                }
                final String s2 = new String(array2, 0, n2);
                final c s3 = this.s;
                ((vm2.c)s3.b).c((a)s3.c, this.t, (String)null, s2);
                this.t = null;
            }
        }
    }
    
    public final void c(final char[] array, int n) throws SAXException {
        this.s = null;
        String s;
        if (n != 0) {
            final vm2.c d = this.f.d(this.g(array, n));
            if (d == null) {
                return;
            }
            s = d.a;
        }
        else {
            s = this.z.c();
        }
        n = 0;
        c z;
        for (z = this.z; z != null && !z.c().equals(s); z = (c)z.d) {
            if ((((vm2.c)z.b).f & 0x4) != 0x0) {
                n = 1;
            }
        }
        if (z == null) {
            return;
        }
        final c c = (c)z.d;
        if (c != null) {
            if (c.d != null) {
                if (n != 0) {
                    z.a = true;
                }
                else {
                    while (this.z != z) {
                        this.o();
                    }
                    this.j();
                }
                while (this.z.a) {
                    this.j();
                }
                this.n(null);
            }
        }
    }
    
    public final void comment(final char[] array, final int n, final int n2) throws SAXException {
    }
    
    public final boolean d(final String s, final String s2) {
        return !s.equals("") && !s2.equals("") && !s2.equals(this.f.c);
    }
    
    public final void e(final char[] array, int n) throws SAXException {
        if (this.s != null) {
            return;
        }
        final String g = this.g(array, n);
        if (g == null) {
            return;
        }
        vm2.c c;
        if ((c = this.f.d(g)) == null) {
            if (this.j) {
                return;
            }
            final boolean k = this.k;
            int n2 = -1;
            if (k) {
                n = 0;
            }
            else {
                n = -1;
            }
            if (!this.l) {
                n2 = Integer.MAX_VALUE;
            }
            this.f.b(g, n, n2, 0);
            if (!this.l) {
                final j f = this.f;
                f.e(g, f.e.a);
            }
            c = this.f.d(g);
        }
        this.s = new c(c, this.m);
    }
    
    public final void endCDATA() throws SAXException {
    }
    
    public final void endDTD() throws SAXException {
    }
    
    public final void endEntity(final String s) throws SAXException {
    }
    
    public final int f(final char[] array, int n, final int n2) {
        final int n3 = 0;
        if (n2 < 1) {
            return 0;
        }
        if (array[n] == '#') {
            Label_0074: {
                if (n2 > 1) {
                    final char c = array[n + 1];
                    if (c != 'x') {
                        if (c != 'X') {
                            break Label_0074;
                        }
                    }
                    try {
                        n = Integer.parseInt(new String(array, n + 2, n2 - 2), 16);
                        return n;
                    }
                    catch (final NumberFormatException ex) {
                        return 0;
                    }
                }
                try {
                    n = Integer.parseInt(new String(array, n + 1, n2 - 1), 10);
                    return n;
                }
                catch (final NumberFormatException ex2) {
                    return 0;
                }
            }
        }
        final Integer n4 = this.f.a.get(new String(array, n, n2));
        if (n4 == null) {
            n = n3;
        }
        else {
            n = n4;
        }
        return n;
    }
    
    public final String g(final char[] array, int length) {
        final StringBuffer sb = new StringBuffer(length + 2);
        int n = 1;
        int n3;
        int n2 = n3 = 0;
        int n4 = length;
        while (true) {
            final char c = '_';
            if (n4 <= 0) {
                break;
            }
            final char c2 = array[n2];
            int n5 = 0;
            Label_0190: {
                if (!Character.isLetter(c2) && c2 != '_') {
                    if (!Character.isDigit(c2) && c2 != '-' && c2 != '.') {
                        length = n;
                        n5 = n3;
                        if (c2 != ':') {
                            break Label_0190;
                        }
                        length = n;
                        if ((n5 = n3) == 0) {
                            if (n != 0) {
                                sb.append('_');
                            }
                            char c3;
                            if (this.n) {
                                c3 = c;
                            }
                            else {
                                length = (c3 = c2);
                            }
                            sb.append(c3);
                            length = (n5 = 1);
                        }
                        break Label_0190;
                    }
                    else {
                        if (n != 0) {
                            sb.append('_');
                        }
                        sb.append(c2);
                    }
                }
                else {
                    sb.append(c2);
                }
                length = 0;
                n5 = n3;
            }
            ++n2;
            --n4;
            n = length;
            n3 = n5;
        }
        length = sb.length();
        if (length == 0 || sb.charAt(length - 1) == ':') {
            sb.append('_');
        }
        return sb.toString().intern();
    }
    
    public final ContentHandler getContentHandler() {
        ContentHandler a;
        if ((a = this.a) == this) {
            a = null;
        }
        return a;
    }
    
    public final DTDHandler getDTDHandler() {
        DTDHandler c;
        if ((c = this.c) == this) {
            c = null;
        }
        return c;
    }
    
    public final EntityResolver getEntityResolver() {
        EntityResolver e;
        if ((e = this.e) == this) {
            e = null;
        }
        return e;
    }
    
    public final ErrorHandler getErrorHandler() {
        ErrorHandler d;
        if ((d = this.d) == this) {
            d = null;
        }
        return d;
    }
    
    public final boolean getFeature(final String s) throws SAXNotRecognizedException, SAXNotSupportedException {
        final Boolean b = this.r.get(s);
        if (b != null) {
            return b;
        }
        final StringBuffer sb = new StringBuffer();
        sb.append("Unknown feature ");
        sb.append(s);
        throw new SAXNotRecognizedException(sb.toString());
    }
    
    public final Object getProperty(final String s) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (s.equals("http://xml.org/sax/properties/lexical-handler")) {
            LexicalHandler b;
            if ((b = this.b) == this) {
                b = null;
            }
            return b;
        }
        if (s.equals("http://www.ccil.org/~cowan/tagsoup/properties/scanner")) {
            return this.g;
        }
        if (s.equals("http://www.ccil.org/~cowan/tagsoup/properties/schema")) {
            return this.f;
        }
        if (s.equals("http://www.ccil.org/~cowan/tagsoup/properties/auto-detector")) {
            return this.h;
        }
        final StringBuffer sb = new StringBuffer();
        sb.append("Unknown property ");
        sb.append(s);
        throw new SAXNotRecognizedException(sb.toString());
    }
    
    public final void h(final char[] array, final int n) throws SAXException {
        if (n == 0) {
            return;
        }
        boolean b = true;
        for (int i = 0; i < n; ++i) {
            if (!Character.isWhitespace(array[0 + i])) {
                b = false;
            }
        }
        if (b && !this.z.a(this.B)) {
            if (this.p) {
                this.a.ignorableWhitespace(array, 0, n);
            }
        }
        else {
            this.m(this.B);
            this.a.characters(array, 0, n);
        }
    }
    
    public final void i(final char[] array, final int n) throws SAXException {
        if (this.s == null) {
            final String y = this.y;
            if (y != null) {
                if ("xml".equalsIgnoreCase(y)) {
                    return;
                }
                int n2;
                if ((n2 = n) > 0) {
                    final int n3 = n - 1;
                    n2 = n;
                    if (array[n3] == '?') {
                        n2 = n3;
                    }
                }
                this.a.processingInstruction(this.y, new String(array, 0, n2));
                this.y = null;
            }
        }
    }
    
    public final void j() throws SAXException {
        final c z = this.z;
        if (z == null) {
            return;
        }
        final String c = z.c();
        final Object b = this.z.b;
        String c2 = ((vm2.c)b).c;
        String b2 = ((vm2.c)b).b;
        final String k = k(c);
        if (!this.i) {
            c2 = "";
            b2 = "";
        }
        this.a.endElement(b2, c2, c);
        if (this.d(k, b2)) {
            this.a.endPrefixMapping(k);
        }
        final a a = (a)this.z.c;
        int a2 = a.a;
        while (true) {
            final int n = a2 - 1;
            if (n < 0) {
                break;
            }
            final String uri = a.getURI(n);
            final String i = k(a.getQName(n));
            a2 = n;
            if (!this.d(i, uri)) {
                continue;
            }
            this.a.endPrefixMapping(i);
            a2 = n;
        }
        this.z = (c)this.z.d;
    }
    
    public final void l(final c z) throws SAXException {
        final String c = z.c();
        final Object b = z.b;
        String c2 = ((vm2.c)b).c;
        String b2 = ((vm2.c)b).b;
        String s = k(c);
        int a = ((a)z.c).a;
        while (true) {
            final int n = a - 1;
            if (n < 0) {
                break;
            }
            final String localName = ((a)z.c).getLocalName(n);
            if (((a)z.c).getValue(n) != null && localName != null) {
                a = n;
                if (localName.length() != 0) {
                    continue;
                }
            }
            ((a)z.c).a(n);
            a = n;
        }
        if (!this.i) {
            c2 = "";
            b2 = "";
        }
        while (true) {
            if (!this.C || !c2.equalsIgnoreCase(this.x)) {
                break Label_0172;
            }
            try {
                this.e.resolveEntity(this.v, this.w);
                if (this.d(s, b2)) {
                    this.a.startPrefixMapping(s, b2);
                }
                final a a2 = (a)z.c;
                for (int a3 = a2.a, i = 0; i < a3; ++i) {
                    final String uri = a2.getURI(i);
                    s = k(a2.getQName(i));
                    if (this.d(s, uri)) {
                        this.a.startPrefixMapping(s, uri);
                    }
                }
                this.a.startElement(b2, c2, c, (Attributes)z.c);
                z.d = this.z;
                this.z = z;
                this.C = false;
                if (this.q && (((vm2.c)z.b).f & 0x2) != 0x0) {
                    this.g.startCDATA();
                }
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void m(c d) throws SAXException {
        c z;
        while (true) {
            for (z = this.z; z != null && !z.a((c)d); z = (c)z.d) {}
            if (z != null) {
                break;
            }
            final vm2.c h = ((vm2.c)((c)d).b).h;
            if (h == null) {
                break;
            }
            final c c = new c(h, this.m);
            c.d = d;
            d = c;
        }
        if (z == null) {
            return;
        }
        Object o;
        while (true) {
            final c z2 = this.z;
            o = d;
            if (z2 == z) {
                break;
            }
            o = d;
            if (z2 == null) {
                break;
            }
            final Object d2 = z2.d;
            o = d;
            if (d2 == null) {
                break;
            }
            if (((c)d2).d == null) {
                o = d;
                break;
            }
            this.o();
        }
        while (o != null) {
            d = ((c)o).d;
            if (!((c)o).c().equals("<pcdata>")) {
                this.l((c)o);
            }
            this.n((c)d);
            o = d;
        }
        this.s = null;
    }
    
    public final void n(final c c) throws SAXException {
        while (true) {
            final c a = this.A;
            if (a == null || !this.z.a(a) || (c != null && !this.A.a(c))) {
                break;
            }
            final c a2 = this.A;
            final c a3 = (c)a2.d;
            this.l(a2);
            this.A = a3;
        }
    }
    
    public final void o() throws SAXException {
        final c z = this.z;
        this.j();
        if (this.o && (((vm2.c)z.b).f & 0x1) != 0x0) {
            int a = ((a)z.c).a;
            while (true) {
                final int n = a - 1;
                if (n < 0) {
                    break;
                }
                if (!((a)z.c).getType(n).equals("ID")) {
                    a = n;
                    if (!((a)z.c).getQName(n).equals("name")) {
                        continue;
                    }
                }
                ((a)z.c).a(n);
                a = n;
            }
            z.d = this.A;
            this.A = z;
        }
    }
    
    public final void p(final char[] array, final int n) throws SAXException {
        final c s = this.s;
        if (s == null) {
            return;
        }
        this.m(s);
        if (((vm2.c)this.z.b).d == 0) {
            this.c(array, n);
        }
    }
    
    public final void parse(final String s) throws IOException, SAXException {
        this.parse(new InputSource(s));
    }
    
    public final void parse(final InputSource inputSource) throws IOException, SAXException {
        if (this.f == null) {
            this.f = new e();
        }
        if (this.g == null) {
            this.g = (i)new d();
        }
        if (this.h == null) {
            this.h = (b)new f();
        }
        this.z = new c(this.f.d("<root>"), this.m);
        this.B = new c(this.f.d("<pcdata>"), this.m);
        this.s = null;
        this.t = null;
        this.y = null;
        this.A = null;
        this.C = true;
        this.w = null;
        this.v = null;
        this.x = null;
        final Reader characterStream = inputSource.getCharacterStream();
        final InputStream byteStream = inputSource.getByteStream();
        final String encoding = inputSource.getEncoding();
        inputSource.getPublicId();
        final String systemId = inputSource.getSystemId();
        Closeable closeable;
        if ((closeable = characterStream) == null) {
            if ((closeable = byteStream) == null) {
                final StringBuffer sb = new StringBuffer();
                sb.append(System.getProperty("user.dir"));
                sb.append("/.");
                closeable = ((URLConnection)FirebasePerfUrlConnection.instrument((Object)new URL(new URL("file", "", sb.toString()), systemId).openConnection())).getInputStream();
            }
            if (encoding == null) {
                closeable = this.h.a((InputStream)closeable);
            }
            else {
                try {
                    closeable = new InputStreamReader((InputStream)closeable, encoding);
                }
                catch (final UnsupportedEncodingException ex) {
                    closeable = new InputStreamReader((InputStream)closeable);
                }
            }
        }
        this.a.startDocument();
        this.g.b(inputSource.getPublicId(), inputSource.getSystemId());
        final i g = this.g;
        if (g instanceof Locator) {
            this.a.setDocumentLocator((Locator)g);
        }
        if (!this.f.c.equals("")) {
            final ContentHandler a = this.a;
            final j f = this.f;
            a.startPrefixMapping(f.d, f.c);
        }
        this.g.a((Reader)closeable, (h)this);
    }
    
    public final void setContentHandler(final ContentHandler contentHandler) {
        ContentHandler a = contentHandler;
        if (contentHandler == null) {
            a = this;
        }
        this.a = a;
    }
    
    public final void setDTDHandler(final DTDHandler dtdHandler) {
        DTDHandler c = dtdHandler;
        if (dtdHandler == null) {
            c = this;
        }
        this.c = c;
    }
    
    public final void setEntityResolver(final EntityResolver entityResolver) {
        EntityResolver e = entityResolver;
        if (entityResolver == null) {
            e = this;
        }
        this.e = e;
    }
    
    public final void setErrorHandler(final ErrorHandler errorHandler) {
        ErrorHandler d = errorHandler;
        if (errorHandler == null) {
            d = this;
        }
        this.d = d;
    }
    
    public final void setFeature(final String s, final boolean q) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (this.r.get(s) != null) {
            if (q) {
                this.r.put(s, Boolean.TRUE);
            }
            else {
                this.r.put(s, Boolean.FALSE);
            }
            if (s.equals("http://xml.org/sax/features/namespaces")) {
                this.i = q;
            }
            else if (s.equals("http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons")) {
                this.j = q;
            }
            else if (s.equals("http://www.ccil.org/~cowan/tagsoup/features/bogons-empty")) {
                this.k = q;
            }
            else if (s.equals("http://www.ccil.org/~cowan/tagsoup/features/root-bogons")) {
                this.l = q;
            }
            else if (s.equals("http://www.ccil.org/~cowan/tagsoup/features/default-attributes")) {
                this.m = q;
            }
            else if (s.equals("http://www.ccil.org/~cowan/tagsoup/features/translate-colons")) {
                this.n = q;
            }
            else if (s.equals("http://www.ccil.org/~cowan/tagsoup/features/restart-elements")) {
                this.o = q;
            }
            else if (s.equals("http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace")) {
                this.p = q;
            }
            else if (s.equals("http://www.ccil.org/~cowan/tagsoup/features/cdata-elements")) {
                this.q = q;
            }
            return;
        }
        final StringBuffer sb = new StringBuffer();
        sb.append("Unknown feature ");
        sb.append(s);
        throw new SAXNotRecognizedException(sb.toString());
    }
    
    public final void setProperty(final String s, final Object o) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (s.equals("http://xml.org/sax/properties/lexical-handler")) {
            if (o == null) {
                this.b = this;
            }
            else {
                if (!(o instanceof LexicalHandler)) {
                    throw new SAXNotSupportedException("Your lexical handler is not a LexicalHandler");
                }
                this.b = (LexicalHandler)o;
            }
        }
        else if (s.equals("http://www.ccil.org/~cowan/tagsoup/properties/scanner")) {
            if (!(o instanceof i)) {
                throw new SAXNotSupportedException("Your scanner is not a Scanner");
            }
            this.g = (i)o;
        }
        else if (s.equals("http://www.ccil.org/~cowan/tagsoup/properties/schema")) {
            if (!(o instanceof j)) {
                throw new SAXNotSupportedException("Your schema is not a Schema");
            }
            this.f = (j)o;
        }
        else {
            if (!s.equals("http://www.ccil.org/~cowan/tagsoup/properties/auto-detector")) {
                final StringBuffer sb = new StringBuffer();
                sb.append("Unknown property ");
                sb.append(s);
                throw new SAXNotRecognizedException(sb.toString());
            }
            if (!(o instanceof b)) {
                throw new SAXNotSupportedException("Your auto-detector is not an AutoDetector");
            }
            this.h = (b)o;
        }
    }
    
    public final void startCDATA() throws SAXException {
    }
    
    public final void startDTD(final String s, final String s2, final String s3) throws SAXException {
    }
    
    public final void startEntity(final String s) throws SAXException {
    }
}
