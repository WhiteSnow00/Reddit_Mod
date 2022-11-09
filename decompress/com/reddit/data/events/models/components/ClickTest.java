// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class ClickTest
{
    public static final a<ClickTest, ClickTest.ClickTest$Builder> ADAPTER;
    public final Long id;
    public final String name;
    public final String owner;
    public final String page_type;
    public final String prompt;
    public final String response;
    public final String variant;
    
    static {
        ADAPTER = (a)new ClickTest.ClickTest$ClickTestAdapter((ClickTest$1)null);
    }
    
    private ClickTest(final ClickTest.ClickTest$Builder clickTest$Builder) {
        this.id = ClickTest.ClickTest$Builder.access$100(clickTest$Builder);
        this.name = ClickTest.ClickTest$Builder.access$200(clickTest$Builder);
        this.owner = ClickTest.ClickTest$Builder.access$300(clickTest$Builder);
        this.variant = ClickTest.ClickTest$Builder.access$400(clickTest$Builder);
        this.prompt = ClickTest.ClickTest$Builder.access$500(clickTest$Builder);
        this.response = ClickTest.ClickTest$Builder.access$600(clickTest$Builder);
        this.page_type = ClickTest.ClickTest$Builder.access$700(clickTest$Builder);
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
        if (!(o instanceof ClickTest)) {
            return false;
        }
        final ClickTest clickTest = (ClickTest)o;
        final Long id = this.id;
        final Long id2 = clickTest.id;
        if (id == id2 || id.equals(id2)) {
            final String name = this.name;
            final String name2 = clickTest.name;
            if (name == name2 || (name != null && name.equals(name2))) {
                final String owner = this.owner;
                final String owner2 = clickTest.owner;
                if (owner == owner2 || (owner != null && owner.equals(owner2))) {
                    final String variant = this.variant;
                    final String variant2 = clickTest.variant;
                    if (variant == variant2 || (variant != null && variant.equals(variant2))) {
                        final String prompt = this.prompt;
                        final String prompt2 = clickTest.prompt;
                        if (prompt == prompt2 || (prompt != null && prompt.equals(prompt2))) {
                            final String response = this.response;
                            final String response2 = clickTest.response;
                            if (response == response2 || (response != null && response.equals(response2))) {
                                final String page_type = this.page_type;
                                final String page_type2 = clickTest.page_type;
                                boolean b2 = b;
                                if (page_type == page_type2) {
                                    return b2;
                                }
                                if (page_type != null && page_type.equals(page_type2)) {
                                    b2 = b;
                                    return b2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String name = this.name;
        int hashCode2 = 0;
        int hashCode3;
        if (name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = name.hashCode();
        }
        final String owner = this.owner;
        int hashCode4;
        if (owner == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = owner.hashCode();
        }
        final String variant = this.variant;
        int hashCode5;
        if (variant == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = variant.hashCode();
        }
        final String prompt = this.prompt;
        int hashCode6;
        if (prompt == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = prompt.hashCode();
        }
        final String response = this.response;
        int hashCode7;
        if (response == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = response.hashCode();
        }
        final String page_type = this.page_type;
        if (page_type != null) {
            hashCode2 = page_type.hashCode();
        }
        return (((((((hashCode ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode2) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ClickTest{id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", owner=");
        k.append(this.owner);
        k.append(", variant=");
        k.append(this.variant);
        k.append(", prompt=");
        k.append(this.prompt);
        k.append(", response=");
        k.append(this.response);
        k.append(", page_type=");
        return b.j(k, this.page_type, "}");
    }
    
    public void write(final e e) throws IOException {
        ClickTest.ADAPTER.write(e, (Object)this);
    }
}
