// 
// Decompiled by Procyon v0.6.0
// 

package k7;

import java.util.LinkedHashMap;
import a4.a0;
import java.util.Map;
import java.math.BigDecimal;
import hg2.j;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import com.apollographql.apollo.api.internal.json.JsonReader$Token;
import com.apollographql.apollo.api.internal.json.JsonReader;

public final class e
{
    public final JsonReader a;
    
    public e(final k7.a a) {
        this.a = (JsonReader)a;
    }
    
    public final void a(final boolean b) throws IOException {
        if (!b && this.a.peek() == JsonReader$Token.NULL) {
            throw new NullPointerException("corrupted response reader, expected non null value");
        }
    }
    
    public final <T> List<T> b(final boolean b, final a<T> a) throws IOException {
        this.a(b);
        List<T> list;
        if (this.a.peek() == JsonReader$Token.NULL) {
            this.a.B1();
            list = null;
        }
        else {
            this.a.r1();
            final ArrayList list2 = new ArrayList();
            while (this.a.hasNext()) {
                list2.add(a.a(this));
            }
            this.a.q1();
            list = list2;
        }
        return list;
    }
    
    public final <T> T c(final boolean b, final b<T> b2) throws IOException {
        this.a(b);
        T a;
        if (this.a.peek() == JsonReader$Token.NULL) {
            this.a.B1();
            a = null;
        }
        else {
            this.a.P1();
            a = b2.a(this);
            this.a.e2();
        }
        return a;
    }
    
    public final Object d() throws IOException {
        final JsonReader$Token peek = this.a.peek();
        final JsonReader$Token null = JsonReader$Token.NULL;
        final int n = 1;
        final boolean b = peek == null;
        Object o = null;
        if (b) {
            this.a.F1();
            final j a = j.a;
        }
        else if (this.a.peek() == JsonReader$Token.BOOLEAN) {
            this.a(false);
            if (this.a.peek() == null) {
                this.a.B1();
            }
            else {
                o = this.a.W1();
            }
        }
        else if (this.a.peek() == JsonReader$Token.LONG) {
            this.a(false);
            Long value;
            if (this.a.peek() == null) {
                this.a.B1();
                value = null;
            }
            else {
                value = this.a.nextLong();
            }
            if (value == null) {
                sg2.e.m();
                throw null;
            }
            o = new BigDecimal(value);
        }
        else {
            int n2;
            if (this.a.peek() == JsonReader$Token.NUMBER) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                final String e = this.e();
                if (e == null) {
                    sg2.e.m();
                    throw null;
                }
                o = new BigDecimal(e);
            }
            else {
                o = this.e();
            }
        }
        return o;
    }
    
    public final String e() throws IOException {
        this.a(false);
        String y1;
        if (this.a.peek() == JsonReader$Token.NULL) {
            this.a.B1();
            y1 = null;
        }
        else {
            y1 = this.a.Y1();
        }
        return y1;
    }
    
    public final List<Object> f() throws IOException {
        return this.b(false, (a<Object>)new e$c(this));
    }
    
    public final Map<String, Object> g() throws IOException {
        if (this.a.peek() == JsonReader$Token.BEGIN_OBJECT) {
            return this.c(false, (b<Map<String, Object>>)new a0());
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (this.a.hasNext()) {
            final String m1 = this.a.M1();
            if (this.a.peek() == JsonReader$Token.NULL) {
                this.a.F1();
                final j a = j.a;
                linkedHashMap.put(m1, null);
            }
            else if (this.a.peek() == JsonReader$Token.BEGIN_OBJECT) {
                linkedHashMap.put(m1, this.c(false, (b<Map<?, ?>>)new a0()));
            }
            else if (this.a.peek() == JsonReader$Token.BEGIN_ARRAY) {
                linkedHashMap.put(m1, this.f());
            }
            else {
                linkedHashMap.put(m1, this.d());
            }
        }
        return linkedHashMap;
    }
    
    public interface a<T>
    {
        T a(final e p0) throws IOException;
    }
    
    public interface b<T>
    {
        T a(final e p0) throws IOException;
    }
}
