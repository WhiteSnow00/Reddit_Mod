// 
// Decompiled by Procyon v0.6.0
// 

package u6;

import androidx.viewpager.widget.c;
import ah2.f;

public interface d
{
    public static final class a implements d
    {
        public final String a = "animations/recap_loading.json";
        
        @Override
        public final boolean equals(final Object o) {
            final String a = this.a;
            final boolean b = o instanceof a;
            boolean b2 = false;
            if (b) {
                if (ah2.f.a((Object)a, (Object)((a)o).a)) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return androidx.viewpager.widget.c.i("Asset(assetName=", this.a, ')');
        }
    }
    
    public static final class b implements d
    {
        @Override
        public final boolean equals(final Object o) {
            final boolean b = o instanceof b;
            boolean b2 = false;
            if (b) {
                o.getClass();
                if (ah2.f.a((Object)null, (Object)null)) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public final int hashCode() {
            throw null;
        }
        
        @Override
        public final String toString() {
            return "ContentProvider(uri=null)";
        }
    }
    
    public static final class c implements d
    {
        @Override
        public final boolean equals(final Object o) {
            final boolean b = o instanceof c;
            boolean b2 = false;
            if (b) {
                o.getClass();
                if (ah2.f.a((Object)null, (Object)null)) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public final int hashCode() {
            throw null;
        }
        
        @Override
        public final String toString() {
            return "File(fileName=null)";
        }
    }
    
    public static final class d implements u6.d
    {
        @Override
        public final boolean equals(final Object o) {
            final boolean b = o instanceof d;
            boolean b2 = false;
            if (b) {
                o.getClass();
                if (ah2.f.a((Object)null, (Object)null)) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public final int hashCode() {
            throw null;
        }
        
        @Override
        public final String toString() {
            return "JsonString(jsonString=null)";
        }
    }
    
    public static final class e implements d
    {
        public final int a = a;
        
        @Override
        public final boolean equals(final Object o) {
            final int a = this.a;
            final boolean b = o instanceof e;
            boolean b2 = false;
            if (b) {
                if (a == ((e)o).a) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public final int hashCode() {
            return Integer.hashCode(this.a);
        }
        
        @Override
        public final String toString() {
            return a.g("RawRes(resId=", this.a, ')');
        }
    }
    
    public static final class f implements d
    {
        @Override
        public final boolean equals(final Object o) {
            final boolean b = o instanceof f;
            boolean b2 = false;
            if (b) {
                o.getClass();
                if (ah2.f.a((Object)null, (Object)null)) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public final int hashCode() {
            throw null;
        }
        
        @Override
        public final String toString() {
            return "Url(url=null)";
        }
    }
}
