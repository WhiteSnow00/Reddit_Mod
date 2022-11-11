// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import ah2.f;
import com.reddit.domain.model.Account;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/search/AccountSearchResultItem;", "Lcom/reddit/domain/model/search/SearchResultItem;", "relativeIndex", "", "account", "Lcom/reddit/domain/model/Account;", "(ILcom/reddit/domain/model/Account;)V", "getAccount", "()Lcom/reddit/domain/model/Account;", "getRelativeIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AccountSearchResultItem extends SearchResultItem
{
    private final Account account;
    private final int relativeIndex;
    
    public AccountSearchResultItem(final int relativeIndex, final Account account) {
        f.f((Object)account, "account");
        this.relativeIndex = relativeIndex;
        this.account = account;
    }
    
    public final int component1() {
        return this.getRelativeIndex();
    }
    
    public final Account component2() {
        return this.account;
    }
    
    public final AccountSearchResultItem copy(final int n, final Account account) {
        f.f((Object)account, "account");
        return new AccountSearchResultItem(n, account);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccountSearchResultItem)) {
            return false;
        }
        final AccountSearchResultItem accountSearchResultItem = (AccountSearchResultItem)o;
        return this.getRelativeIndex() == accountSearchResultItem.getRelativeIndex() && f.a((Object)this.account, (Object)accountSearchResultItem.account);
    }
    
    public final Account getAccount() {
        return this.account;
    }
    
    @Override
    public int getRelativeIndex() {
        return this.relativeIndex;
    }
    
    @Override
    public int hashCode() {
        return this.account.hashCode() + Integer.hashCode(this.getRelativeIndex()) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AccountSearchResultItem(relativeIndex=");
        k.append(this.getRelativeIndex());
        k.append(", account=");
        k.append(this.account);
        k.append(')');
        return k.toString();
    }
}
