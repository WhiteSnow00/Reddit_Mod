// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/model/Gender;", "", "definedGender", "", "genderCategory", "Lcom/reddit/domain/model/GenderOption;", "(Ljava/lang/String;Lcom/reddit/domain/model/GenderOption;)V", "getDefinedGender", "()Ljava/lang/String;", "getGenderCategory", "()Lcom/reddit/domain/model/GenderOption;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Gender
{
    private final String definedGender;
    private final GenderOption genderCategory;
    
    public Gender() {
        this(null, null, 3, null);
    }
    
    public Gender(final String definedGender, final GenderOption genderCategory) {
        this.definedGender = definedGender;
        this.genderCategory = genderCategory;
    }
    
    public final String component1() {
        return this.definedGender;
    }
    
    public final GenderOption component2() {
        return this.genderCategory;
    }
    
    public final Gender copy(final String s, final GenderOption genderOption) {
        return new Gender(s, genderOption);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Gender)) {
            return false;
        }
        final Gender gender = (Gender)o;
        return f.a((Object)this.definedGender, (Object)gender.definedGender) && this.genderCategory == gender.genderCategory;
    }
    
    public final String getDefinedGender() {
        return this.definedGender;
    }
    
    public final GenderOption getGenderCategory() {
        return this.genderCategory;
    }
    
    @Override
    public int hashCode() {
        final String definedGender = this.definedGender;
        int hashCode = 0;
        int hashCode2;
        if (definedGender == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = definedGender.hashCode();
        }
        final GenderOption genderCategory = this.genderCategory;
        if (genderCategory != null) {
            hashCode = genderCategory.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Gender(definedGender=");
        k.append(this.definedGender);
        k.append(", genderCategory=");
        k.append(this.genderCategory);
        k.append(')');
        return k.toString();
    }
}
