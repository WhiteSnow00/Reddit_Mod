// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import ak0.n;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class CategoryHeader
{
    public static final a<CategoryHeader, CategoryHeader.CategoryHeader$Builder> ADAPTER;
    public final String id;
    public final String name;
    public final List<String> subreddit_ids;
    public final List<String> subreddit_names;
    
    static {
        ADAPTER = (a)new CategoryHeader.CategoryHeader$CategoryHeaderAdapter((CategoryHeader$1)null);
    }
    
    private CategoryHeader(final CategoryHeader.CategoryHeader$Builder categoryHeader$Builder) {
        this.id = CategoryHeader.CategoryHeader$Builder.access$100(categoryHeader$Builder);
        this.name = CategoryHeader.CategoryHeader$Builder.access$200(categoryHeader$Builder);
        final List access$300 = CategoryHeader.CategoryHeader$Builder.access$300(categoryHeader$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$300 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)CategoryHeader.CategoryHeader$Builder.access$300(categoryHeader$Builder));
        }
        this.subreddit_ids = unmodifiableList;
        List<String> unmodifiableList2;
        if (CategoryHeader.CategoryHeader$Builder.access$400(categoryHeader$Builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)CategoryHeader.CategoryHeader$Builder.access$400(categoryHeader$Builder));
        }
        this.subreddit_names = unmodifiableList2;
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
        if (!(o instanceof CategoryHeader)) {
            return false;
        }
        final CategoryHeader categoryHeader = (CategoryHeader)o;
        final String id = this.id;
        final String id2 = categoryHeader.id;
        if (id == id2 || id.equals(id2)) {
            final String name = this.name;
            final String name2 = categoryHeader.name;
            if (name == name2 || name.equals(name2)) {
                final List<String> subreddit_ids = this.subreddit_ids;
                final List<String> subreddit_ids2 = categoryHeader.subreddit_ids;
                if (subreddit_ids == subreddit_ids2 || (subreddit_ids != null && subreddit_ids.equals(subreddit_ids2))) {
                    final List<String> subreddit_names = this.subreddit_names;
                    final List<String> subreddit_names2 = categoryHeader.subreddit_names;
                    boolean b2 = b;
                    if (subreddit_names == subreddit_names2) {
                        return b2;
                    }
                    if (subreddit_names != null && subreddit_names.equals(subreddit_names2)) {
                        b2 = b;
                        return b2;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final int hashCode2 = this.name.hashCode();
        final List<String> subreddit_ids = this.subreddit_ids;
        int hashCode3 = 0;
        int hashCode4;
        if (subreddit_ids == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = subreddit_ids.hashCode();
        }
        final List<String> subreddit_names = this.subreddit_names;
        if (subreddit_names != null) {
            hashCode3 = subreddit_names.hashCode();
        }
        return ((((hashCode ^ 0x1000193) * -2128831035 ^ hashCode2) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode3) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CategoryHeader{id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", subreddit_ids=");
        k.append(this.subreddit_ids);
        k.append(", subreddit_names=");
        return n.r(k, (List)this.subreddit_names, "}");
    }
    
    public void write(final e e) throws IOException {
        CategoryHeader.ADAPTER.write(e, (Object)this);
    }
}
