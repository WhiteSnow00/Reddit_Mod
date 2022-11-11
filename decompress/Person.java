// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.os.BaseBundle;
import android.content.Context;
import android.app.Person$Builder;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.util.Log;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public class Person
{
    private static final String ICON_KEY = "icon";
    private static final String IS_BOT_KEY = "isBot";
    private static final String IS_IMPORTANT_KEY = "isImportant";
    private static final String KEY_KEY = "key";
    private static final String NAME_KEY = "name";
    private static final String URI_KEY = "uri";
    public IconCompat mIcon;
    public boolean mIsBot;
    public boolean mIsImportant;
    public String mKey;
    public CharSequence mName;
    public String mUri;
    
    public Person(final Builder builder) {
        this.mName = builder.mName;
        this.mIcon = builder.mIcon;
        this.mUri = builder.mUri;
        this.mKey = builder.mKey;
        this.mIsBot = builder.mIsBot;
        this.mIsImportant = builder.mIsImportant;
    }
    
    public static Person fromAndroidPerson(final android.app.Person person) {
        return b.a(person);
    }
    
    public static Person fromBundle(final Bundle bundle) {
        final Bundle bundle2 = bundle.getBundle("icon");
        final Builder setName = new Builder().setName(bundle.getCharSequence("name"));
        IconCompat icon;
        final IconCompat iconCompat = icon = null;
        if (bundle2 != null) {
            final PorterDuff$Mode k = IconCompat.k;
            final int int1 = ((BaseBundle)bundle2).getInt("type");
            icon = new IconCompat(int1);
            icon.e = ((BaseBundle)bundle2).getInt("int1");
            icon.f = ((BaseBundle)bundle2).getInt("int2");
            icon.j = ((BaseBundle)bundle2).getString("string1");
            if (((BaseBundle)bundle2).containsKey("tint_list")) {
                icon.g = (ColorStateList)bundle2.getParcelable("tint_list");
            }
            if (((BaseBundle)bundle2).containsKey("tint_mode")) {
                icon.h = PorterDuff$Mode.valueOf(((BaseBundle)bundle2).getString("tint_mode"));
            }
            switch (int1) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown type ");
                    sb.append(int1);
                    Log.w("IconCompat", sb.toString());
                    icon = iconCompat;
                    break;
                }
                case 3: {
                    icon.b = bundle2.getByteArray("obj");
                    break;
                }
                case 2:
                case 4:
                case 6: {
                    icon.b = ((BaseBundle)bundle2).getString("obj");
                    break;
                }
                case -1:
                case 1:
                case 5: {
                    icon.b = bundle2.getParcelable("obj");
                    break;
                }
            }
        }
        return setName.setIcon(icon).setUri(((BaseBundle)bundle).getString("uri")).setKey(((BaseBundle)bundle).getString("key")).setBot(((BaseBundle)bundle).getBoolean("isBot")).setImportant(((BaseBundle)bundle).getBoolean("isImportant")).build();
    }
    
    public static Person fromPersistableBundle(final PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }
    
    public IconCompat getIcon() {
        return this.mIcon;
    }
    
    public String getKey() {
        return this.mKey;
    }
    
    public CharSequence getName() {
        return this.mName;
    }
    
    public String getUri() {
        return this.mUri;
    }
    
    public boolean isBot() {
        return this.mIsBot;
    }
    
    public boolean isImportant() {
        return this.mIsImportant;
    }
    
    public String resolveToLegacyUri() {
        final String mUri = this.mUri;
        if (mUri != null) {
            return mUri;
        }
        if (this.mName != null) {
            final StringBuilder k = a.k("name:");
            k.append((Object)this.mName);
            return k.toString();
        }
        return "";
    }
    
    public android.app.Person toAndroidPerson() {
        return b.b(this);
    }
    
    public Builder toBuilder() {
        return new Builder(this);
    }
    
    public Bundle toBundle() {
        final Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.mName);
        final IconCompat mIcon = this.mIcon;
        Bundle bundle3;
        if (mIcon != null) {
            mIcon.getClass();
            final Bundle bundle2 = new Bundle();
            switch (mIcon.a) {
                default: {
                    throw new IllegalArgumentException("Invalid icon");
                }
                case 3: {
                    bundle2.putByteArray("obj", (byte[])mIcon.b);
                    break;
                }
                case 2:
                case 4:
                case 6: {
                    ((BaseBundle)bundle2).putString("obj", (String)mIcon.b);
                    break;
                }
                case 1:
                case 5: {
                    bundle2.putParcelable("obj", (Parcelable)mIcon.b);
                    break;
                }
                case -1: {
                    bundle2.putParcelable("obj", (Parcelable)mIcon.b);
                    break;
                }
            }
            ((BaseBundle)bundle2).putInt("type", mIcon.a);
            ((BaseBundle)bundle2).putInt("int1", mIcon.e);
            ((BaseBundle)bundle2).putInt("int2", mIcon.f);
            ((BaseBundle)bundle2).putString("string1", mIcon.j);
            final ColorStateList g = mIcon.g;
            if (g != null) {
                bundle2.putParcelable("tint_list", (Parcelable)g);
            }
            final PorterDuff$Mode h = mIcon.h;
            bundle3 = bundle2;
            if (h != IconCompat.k) {
                ((BaseBundle)bundle2).putString("tint_mode", ((Enum)h).name());
                bundle3 = bundle2;
            }
        }
        else {
            bundle3 = null;
        }
        bundle.putBundle("icon", bundle3);
        ((BaseBundle)bundle).putString("uri", this.mUri);
        ((BaseBundle)bundle).putString("key", this.mKey);
        ((BaseBundle)bundle).putBoolean("isBot", this.mIsBot);
        ((BaseBundle)bundle).putBoolean("isImportant", this.mIsImportant);
        return bundle;
    }
    
    public PersistableBundle toPersistableBundle() {
        return a.b(this);
    }
    
    public static class Builder
    {
        public IconCompat mIcon;
        public boolean mIsBot;
        public boolean mIsImportant;
        public String mKey;
        public CharSequence mName;
        public String mUri;
        
        public Builder() {
        }
        
        public Builder(final Person person) {
            this.mName = person.mName;
            this.mIcon = person.mIcon;
            this.mUri = person.mUri;
            this.mKey = person.mKey;
            this.mIsBot = person.mIsBot;
            this.mIsImportant = person.mIsImportant;
        }
        
        public Person build() {
            return new Person(this);
        }
        
        public Builder setBot(final boolean mIsBot) {
            this.mIsBot = mIsBot;
            return this;
        }
        
        public Builder setIcon(final IconCompat mIcon) {
            this.mIcon = mIcon;
            return this;
        }
        
        public Builder setImportant(final boolean mIsImportant) {
            this.mIsImportant = mIsImportant;
            return this;
        }
        
        public Builder setKey(final String mKey) {
            this.mKey = mKey;
            return this;
        }
        
        public Builder setName(final CharSequence mName) {
            this.mName = mName;
            return this;
        }
        
        public Builder setUri(final String mUri) {
            this.mUri = mUri;
            return this;
        }
    }
    
    public static final class a
    {
        public static Person a(final PersistableBundle persistableBundle) {
            return new Builder().setName(((BaseBundle)persistableBundle).getString("name")).setUri(((BaseBundle)persistableBundle).getString("uri")).setKey(((BaseBundle)persistableBundle).getString("key")).setBot(((BaseBundle)persistableBundle).getBoolean("isBot")).setImportant(((BaseBundle)persistableBundle).getBoolean("isImportant")).build();
        }
        
        public static PersistableBundle b(final Person person) {
            final PersistableBundle persistableBundle = new PersistableBundle();
            final CharSequence mName = person.mName;
            String string;
            if (mName != null) {
                string = mName.toString();
            }
            else {
                string = null;
            }
            ((BaseBundle)persistableBundle).putString("name", string);
            ((BaseBundle)persistableBundle).putString("uri", person.mUri);
            ((BaseBundle)persistableBundle).putString("key", person.mKey);
            ((BaseBundle)persistableBundle).putBoolean("isBot", person.mIsBot);
            ((BaseBundle)persistableBundle).putBoolean("isImportant", person.mIsImportant);
            return persistableBundle;
        }
    }
    
    public static final class b
    {
        public static Person a(final android.app.Person person) {
            final Builder setName = new Builder().setName(person.getName());
            IconCompat a;
            if (person.getIcon() != null) {
                final Icon icon = person.getIcon();
                final PorterDuff$Mode k = IconCompat.k;
                a = IconCompat.a.a(icon);
            }
            else {
                a = null;
            }
            return setName.setIcon(a).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }
        
        public static android.app.Person b(final Person person) {
            final Person$Builder setName = new Person$Builder().setName(person.getName());
            final IconCompat icon = person.getIcon();
            Icon g = null;
            if (icon != null) {
                final IconCompat icon2 = person.getIcon();
                icon2.getClass();
                g = IconCompat.a.g(icon2, null);
            }
            return setName.setIcon(g).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }
    }
}
