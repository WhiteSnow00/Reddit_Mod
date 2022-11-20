// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class Popup
{
    public static final a<Popup, Builder> ADAPTER;
    public final String button_text;
    public final String id;
    public final String text;
    
    static {
        ADAPTER = (a)new PopupAdapter(null);
    }
    
    private Popup(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.button_text = Builder.access$200(builder);
        this.text = Builder.access$300(builder);
    }
    
    public Popup(final Builder builder, final Popup$1 object) {
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
        if (!(o instanceof Popup)) {
            return false;
        }
        final Popup popup = (Popup)o;
        final String id = this.id;
        final String id2 = popup.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String button_text = this.button_text;
            final String button_text2 = popup.button_text;
            if (button_text == button_text2 || (button_text != null && button_text.equals(button_text2))) {
                final String text = this.text;
                final String text2 = popup.text;
                boolean b2 = b;
                if (text == text2) {
                    return b2;
                }
                if (text != null && text.equals(text2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String button_text = this.button_text;
        int hashCode3;
        if (button_text == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = button_text.hashCode();
        }
        final String text = this.text;
        if (text != null) {
            hashCode = text.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Popup{id=");
        t.append(this.id);
        t.append(", button_text=");
        t.append(this.button_text);
        t.append(", text=");
        return ph0.a.f(t, this.text, "}");
    }
    
    public void write(final e e) throws IOException {
        Popup.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Popup>
    {
        private String button_text;
        private String id;
        private String text;
        
        public Builder() {
        }
        
        public Builder(final Popup popup) {
            this.id = popup.id;
            this.button_text = popup.button_text;
            this.text = popup.text;
        }
        
        public static String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static String access$200(final Builder builder) {
            return builder.button_text;
        }
        
        public static String access$300(final Builder builder) {
            return builder.text;
        }
        
        public Popup build() {
            return new Popup(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder button_text(final String button_text) {
            this.button_text = button_text;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.button_text = null;
            this.text = null;
        }
        
        public Builder text(final String text) {
            this.text = text;
            return this;
        }
    }
    
    public static final class PopupAdapter implements a<Popup, Builder>
    {
        private PopupAdapter() {
        }
        
        public PopupAdapter(final Popup$1 object) {
            this();
        }
        
        public Popup read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Popup read(final e e, final Builder builder) throws IOException {
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
                        if (b != 3) {
                            ht.a.a(e, a);
                        }
                        else if (a == 11) {
                            builder.text(e.F());
                        }
                        else {
                            ht.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.button_text(e.F());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.id(e.F());
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
        
        public void write(final e e, final Popup popup) throws IOException {
            e.X();
            if (popup.id != null) {
                e.O(1, (byte)11);
                e.W(popup.id);
                e.P();
            }
            if (popup.button_text != null) {
                e.O(2, (byte)11);
                e.W(popup.button_text);
                e.P();
            }
            if (popup.text != null) {
                e.O(3, (byte)11);
                e.W(popup.text);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Popup)o);
        }
    }
}
