// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class ProgressModule
{
    public static final a<ProgressModule, Builder> ADAPTER;
    public final String card_name;
    public final String module_name;
    
    static {
        ADAPTER = (a)new ProgressModuleAdapter(null);
    }
    
    private ProgressModule(final Builder builder) {
        this.module_name = Builder.access$100(builder);
        this.card_name = Builder.access$200(builder);
    }
    
    public ProgressModule(final Builder builder, final ProgressModule$1 object) {
        this(builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof ProgressModule)) {
            return false;
        }
        final ProgressModule progressModule = (ProgressModule)o;
        final String module_name = this.module_name;
        final String module_name2 = progressModule.module_name;
        if (module_name == module_name2 || (module_name != null && module_name.equals(module_name2))) {
            final String card_name = this.card_name;
            final String card_name2 = progressModule.card_name;
            boolean b2 = b;
            if (card_name == card_name2) {
                return b2;
            }
            if (card_name != null && card_name.equals(card_name2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String module_name = this.module_name;
        int hashCode = 0;
        int hashCode2;
        if (module_name == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = module_name.hashCode();
        }
        final String card_name = this.card_name;
        if (card_name != null) {
            hashCode = card_name.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ProgressModule{module_name=");
        t.append(this.module_name);
        t.append(", card_name=");
        return ph0.a.f(t, this.card_name, "}");
    }
    
    public void write(final e e) throws IOException {
        ProgressModule.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<ProgressModule>
    {
        private String card_name;
        private String module_name;
        
        public Builder() {
        }
        
        public Builder(final ProgressModule progressModule) {
            this.module_name = progressModule.module_name;
            this.card_name = progressModule.card_name;
        }
        
        public static String access$100(final Builder builder) {
            return builder.module_name;
        }
        
        public static String access$200(final Builder builder) {
            return builder.card_name;
        }
        
        public ProgressModule build() {
            return new ProgressModule(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder card_name(final String card_name) {
            this.card_name = card_name;
            return this;
        }
        
        public Builder module_name(final String module_name) {
            this.module_name = module_name;
            return this;
        }
        
        public void reset() {
            this.module_name = null;
            this.card_name = null;
        }
    }
    
    public static final class ProgressModuleAdapter implements a<ProgressModule, Builder>
    {
        private ProgressModuleAdapter() {
        }
        
        public ProgressModuleAdapter(final ProgressModule$1 object) {
            this();
        }
        
        public ProgressModule read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ProgressModule read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        ht.a.a(e, a);
                    }
                    else if (a == 11) {
                        builder.card_name(e.F());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.module_name(e.F());
                }
                else {
                    ht.a.a(e, a);
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final ProgressModule progressModule) throws IOException {
            e.X();
            if (progressModule.module_name != null) {
                e.O(1, (byte)11);
                e.W(progressModule.module_name);
                e.P();
            }
            if (progressModule.card_name != null) {
                e.O(2, (byte)11);
                e.W(progressModule.card_name);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (ProgressModule)o);
        }
    }
}
