// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lcom/reddit/vault/ProtectVaultEvent;", "", "(Ljava/lang/String;I)V", "Skipped", "PasswordBackupClicked", "ManualBackupClicked", "ConfirmPasswordClicked", "PasswordBackedUp", "ManualBackedUp", "SecureVaultClicked", "public_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum ProtectVaultEvent
{
    private static final ProtectVaultEvent[] $VALUES;
    
    ConfirmPasswordClicked, 
    ManualBackedUp, 
    ManualBackupClicked, 
    PasswordBackedUp, 
    PasswordBackupClicked, 
    SecureVaultClicked, 
    Skipped;
    
    private static final ProtectVaultEvent[] $values() {
        return new ProtectVaultEvent[] { ProtectVaultEvent.Skipped, ProtectVaultEvent.PasswordBackupClicked, ProtectVaultEvent.ManualBackupClicked, ProtectVaultEvent.ConfirmPasswordClicked, ProtectVaultEvent.PasswordBackedUp, ProtectVaultEvent.ManualBackedUp, ProtectVaultEvent.SecureVaultClicked };
    }
    
    static {
        $VALUES = $values();
    }
}
