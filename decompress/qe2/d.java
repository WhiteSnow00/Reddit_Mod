// 
// Decompiled by Procyon v0.6.0
// 

package qe2;

import java.util.Iterator;
import java.util.Collection;
import org.json.JSONObject;

public final class d extends JSONObject
{
    public Collection<String> a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public JSONObject g;
    public int h;
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (d.class != o.getClass()) {
            return false;
        }
        final d d = (d)o;
        final String b = this.b;
        if (b == null) {
            if (d.b != null) {
                return false;
            }
        }
        else if (!b.equals(d.b)) {
            return false;
        }
        final String c = this.c;
        if (c == null) {
            if (d.c != null) {
                return false;
            }
        }
        else if (!c.equals(d.c)) {
            return false;
        }
        final String d2 = this.d;
        if (d2 == null) {
            if (d.d != null) {
                return false;
            }
        }
        else if (!d2.equals(d.d)) {
            return false;
        }
        final String e = this.e;
        if (e == null) {
            if (d.e != null) {
                return false;
            }
        }
        else if (!e.equals(d.e)) {
            return false;
        }
        final String f = this.f;
        if (f == null) {
            if (d.f != null) {
                return false;
            }
        }
        else if (!f.equals(d.f)) {
            return false;
        }
        d.getClass();
        if (this.h != d.h) {
            return false;
        }
        final Collection<String> a = this.a;
        final Object o2 = null;
        if (a == null) {
            if (d.a != null) {
                return false;
            }
        }
        else {
            final String string = a.toString();
            final Collection<String> a2 = d.a;
            String string2;
            if (a2 != null) {
                string2 = a2.toString();
            }
            else {
                string2 = null;
            }
            if (!string.equals(string2)) {
                return false;
            }
        }
        final JSONObject g = this.g;
        if (g == null) {
            if (d.g != null) {
                return false;
            }
        }
        else {
            final String string3 = g.toString();
            final JSONObject g2 = d.g;
            Object string4 = o2;
            if (g2 != null) {
                string4 = g2.toString();
            }
            if (!string3.equals(string4)) {
                return false;
            }
        }
        return true;
    }
    
    public final int hashCode() {
        final String b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.toLowerCase().hashCode();
        }
        final String c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.toLowerCase().hashCode();
        }
        final String d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.toLowerCase().hashCode();
        }
        final String e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.toLowerCase().hashCode();
        }
        final String f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.toLowerCase().hashCode();
        }
        final JSONObject g = this.g;
        if (g != null) {
            hashCode = g.toString().toLowerCase().hashCode();
        }
        int n = (((((((0 + 19) * 19 + hashCode2) * 19 + hashCode3) * 19 + hashCode4) * 19 + hashCode5) * 19 + hashCode6) * 19 + hashCode) * 19 + this.h;
        final Collection<String> a = this.a;
        int n2 = n;
        if (a != null) {
            final Iterator<String> iterator = a.iterator();
            while (true) {
                n2 = n;
                if (!iterator.hasNext()) {
                    break;
                }
                n = n * 19 + iterator.next().toLowerCase().hashCode();
            }
        }
        return n2;
    }
}
