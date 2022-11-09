// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools;

import ah2.f;
import com.reddit.domain.model.mod.ModToolsUserModel;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/modtools/ModToolsListItemModel;", "", "index", "", "userModel", "Lcom/reddit/domain/model/mod/ModToolsUserModel;", "(ILcom/reddit/domain/model/mod/ModToolsUserModel;)V", "getIndex", "()I", "getUserModel", "()Lcom/reddit/domain/model/mod/ModToolsUserModel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ModToolsListItemModel
{
    private final int index;
    private final ModToolsUserModel userModel;
    
    public ModToolsListItemModel(final int index, final ModToolsUserModel userModel) {
        f.f((Object)userModel, "userModel");
        this.index = index;
        this.userModel = userModel;
    }
    
    public final int component1() {
        return this.index;
    }
    
    public final ModToolsUserModel component2() {
        return this.userModel;
    }
    
    public final ModToolsListItemModel copy(final int n, final ModToolsUserModel modToolsUserModel) {
        f.f((Object)modToolsUserModel, "userModel");
        return new ModToolsListItemModel(n, modToolsUserModel);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModToolsListItemModel)) {
            return false;
        }
        final ModToolsListItemModel modToolsListItemModel = (ModToolsListItemModel)o;
        return this.index == modToolsListItemModel.index && f.a((Object)this.userModel, (Object)modToolsListItemModel.userModel);
    }
    
    public final int getIndex() {
        return this.index;
    }
    
    public final ModToolsUserModel getUserModel() {
        return this.userModel;
    }
    
    @Override
    public int hashCode() {
        return this.userModel.hashCode() + Integer.hashCode(this.index) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ModToolsListItemModel(index=");
        k.append(this.index);
        k.append(", userModel=");
        k.append(this.userModel);
        k.append(')');
        return k.toString();
    }
}
