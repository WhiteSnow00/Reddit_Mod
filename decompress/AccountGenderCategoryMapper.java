// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import kotlin.NoWhenBranchMatchedException;
import ah2.f;
import com.reddit.domain.model.GenderOption;
import com.reddit.type.AccountGenderCategory;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¨\u0006\b" }, d2 = { "Lcom/reddit/data/model/AccountGenderCategoryMapper;", "", "()V", "map", "Lcom/reddit/type/AccountGenderCategory;", "genderOption", "Lcom/reddit/domain/model/GenderOption;", "gender", "data-remote_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AccountGenderCategoryMapper
{
    public static final AccountGenderCategoryMapper INSTANCE;
    
    static {
        INSTANCE = new AccountGenderCategoryMapper();
    }
    
    private AccountGenderCategoryMapper() {
    }
    
    public final GenderOption map(final AccountGenderCategory accountGenderCategory) {
        int n;
        if (accountGenderCategory == null) {
            n = -1;
        }
        else {
            n = WhenMappings.$EnumSwitchMapping$1[((Enum)accountGenderCategory).ordinal()];
        }
        GenderOption genderOption;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            genderOption = null;
                        }
                        else {
                            genderOption = GenderOption.OPT_OUT;
                        }
                    }
                    else {
                        genderOption = GenderOption.USER_DEFINED;
                    }
                }
                else {
                    genderOption = GenderOption.NON_BINARY;
                }
            }
            else {
                genderOption = GenderOption.FEMALE;
            }
        }
        else {
            genderOption = GenderOption.MALE;
        }
        return genderOption;
    }
    
    public final AccountGenderCategory map(final GenderOption genderOption) {
        f.f((Object)genderOption, "genderOption");
        final int n = WhenMappings.$EnumSwitchMapping$0[genderOption.ordinal()];
        AccountGenderCategory accountGenderCategory;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        accountGenderCategory = AccountGenderCategory.OPT_OUT;
                    }
                    else {
                        accountGenderCategory = AccountGenderCategory.USER_DEFINED;
                    }
                }
                else {
                    accountGenderCategory = AccountGenderCategory.NON_BINARY;
                }
            }
            else {
                accountGenderCategory = AccountGenderCategory.FEMALE;
            }
        }
        else {
            accountGenderCategory = AccountGenderCategory.MALE;
        }
        return accountGenderCategory;
    }
}
