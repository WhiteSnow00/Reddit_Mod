// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import al0.g7;
import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/model/SelectedLanguage;", "", "translatedDisplayName", "", "isoCode", "isSelected", "", "isSaved", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "()Z", "getIsoCode", "()Ljava/lang/String;", "getTranslatedDisplayName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SelectedLanguage
{
    private final boolean isSaved;
    private final boolean isSelected;
    private final String isoCode;
    private final String translatedDisplayName;
    
    public SelectedLanguage(final String translatedDisplayName, final String isoCode, final boolean isSelected, final boolean isSaved) {
        e.f((Object)translatedDisplayName, "translatedDisplayName");
        e.f((Object)isoCode, "isoCode");
        this.translatedDisplayName = translatedDisplayName;
        this.isoCode = isoCode;
        this.isSelected = isSelected;
        this.isSaved = isSaved;
    }
    
    public final String component1() {
        return this.translatedDisplayName;
    }
    
    public final String component2() {
        return this.isoCode;
    }
    
    public final boolean component3() {
        return this.isSelected;
    }
    
    public final boolean component4() {
        return this.isSaved;
    }
    
    public final SelectedLanguage copy(final String s, final String s2, final boolean b, final boolean b2) {
        e.f((Object)s, "translatedDisplayName");
        e.f((Object)s2, "isoCode");
        return new SelectedLanguage(s, s2, b, b2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SelectedLanguage)) {
            return false;
        }
        final SelectedLanguage selectedLanguage = (SelectedLanguage)o;
        return e.a((Object)this.translatedDisplayName, (Object)selectedLanguage.translatedDisplayName) && e.a((Object)this.isoCode, (Object)selectedLanguage.isoCode) && this.isSelected == selectedLanguage.isSelected && this.isSaved == selectedLanguage.isSaved;
    }
    
    public final String getIsoCode() {
        return this.isoCode;
    }
    
    public final String getTranslatedDisplayName() {
        return this.translatedDisplayName;
    }
    
    @Override
    public int hashCode() {
        final int c = b.c(this.isoCode, this.translatedDisplayName.hashCode() * 31, 31);
        final int isSelected = this.isSelected ? 1 : 0;
        int n = 1;
        int n2 = isSelected;
        if (isSelected != 0) {
            n2 = 1;
        }
        final int isSaved = this.isSaved ? 1 : 0;
        if (isSaved == 0) {
            n = isSaved;
        }
        return (c + n2) * 31 + n;
    }
    
    public final boolean isSaved() {
        return this.isSaved;
    }
    
    public final boolean isSelected() {
        return this.isSelected;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SelectedLanguage(translatedDisplayName=");
        r.append(this.translatedDisplayName);
        r.append(", isoCode=");
        r.append(this.isoCode);
        r.append(", isSelected=");
        r.append(this.isSelected);
        r.append(", isSaved=");
        return g7.m(r, this.isSaved, ')');
    }
}
