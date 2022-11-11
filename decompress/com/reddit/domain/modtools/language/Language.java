// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.language;

import al0.f0;
import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/modtools/language/Language;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Language
{
    private final String id;
    private final String name;
    
    public Language(final String id, final String name) {
        e.f((Object)id, "id");
        e.f((Object)name, "name");
        this.id = id;
        this.name = name;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final Language copy(final String s, final String s2) {
        e.f((Object)s, "id");
        e.f((Object)s2, "name");
        return new Language(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Language)) {
            return false;
        }
        final Language language = (Language)o;
        return e.a((Object)this.id, (Object)language.id) && e.a((Object)this.name, (Object)language.name);
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        return this.name.hashCode() + this.id.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Language(id=");
        r.append(this.id);
        r.append(", name=");
        return f0.n(r, this.name, ')');
    }
}
