// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.features;

import com.reddit.devplatform.features.contextactions.ContextActionsImpl;
import android.view.Menu;
import android.content.Context;
import kotlin.Metadata;

public interface ContextActions
{
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/devplatform/features/ContextActions$ContextMenuType;", "", "(Ljava/lang/String;I)V", "SUBREDDIT", "POST", "COMMENT", "public_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum ContextMenuType
    {
        private static final ContextMenuType[] $VALUES;
        
        COMMENT, 
        POST, 
        SUBREDDIT;
        
        private static final ContextMenuType[] $values() {
            return new ContextMenuType[] { ContextMenuType.SUBREDDIT, ContextMenuType.POST, ContextMenuType.COMMENT };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    public static final class a
    {
        public static void a(final ContextActions contextActions, final Context context, final String s, final Menu menu, final ContextMenuType contextMenuType, final String s2, final b b) {
            ((ContextActionsImpl)contextActions).a(context, s, menu, contextMenuType, s2, b, false);
        }
    }
    
    public static final class b
    {
        public final boolean a;
        public final boolean b;
        
        public b() {
            this(false, 3);
        }
        
        public b(boolean b, final int n) {
            if ((n & 0x1) != 0x0) {
                b = false;
            }
            this(b, false);
        }
        
        public b(final boolean a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.a == b.a && this.b == b.b;
        }
        
        @Override
        public final int hashCode() {
            final int a = this.a ? 1 : 0;
            int n = 1;
            int n2 = a;
            if (a != 0) {
                n2 = 1;
            }
            final int b = this.b ? 1 : 0;
            if (b == 0) {
                n = b;
            }
            return n2 * 31 + n;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("UserContext(isSubscriber=");
            t.append(this.a);
            t.append(", isModerator=");
            return d.n(t, this.b, ')');
        }
    }
}
