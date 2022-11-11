// 
// Decompiled by Procyon v0.6.0
// 

package com.evernote.android.state;

import android.os.BaseBundle;
import android.util.SparseArray;
import java.io.Serializable;
import android.os.Parcelable;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.Map;

public final class InjectionHelper
{
    private final String mBaseKey;
    private final Map<String, Bundler<?>> mBundlers;
    
    public InjectionHelper(final String mBaseKey, final Map<String, Bundler<?>> mBundlers) {
        this.mBaseKey = mBaseKey;
        this.mBundlers = mBundlers;
    }
    
    public boolean getBoolean(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return ((BaseBundle)bundle).getBoolean(k.toString());
    }
    
    public boolean[] getBooleanArray(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return ((BaseBundle)bundle).getBooleanArray(k.toString());
    }
    
    public Boolean getBoxedBoolean(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        if (((BaseBundle)bundle).containsKey(k.toString())) {
            final StringBuilder i = a.k(s);
            i.append(this.mBaseKey);
            return ((BaseBundle)bundle).getBoolean(i.toString());
        }
        return null;
    }
    
    public Byte getBoxedByte(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        if (((BaseBundle)bundle).containsKey(k.toString())) {
            final StringBuilder i = a.k(s);
            i.append(this.mBaseKey);
            return bundle.getByte(i.toString());
        }
        return null;
    }
    
    public Character getBoxedChar(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        if (((BaseBundle)bundle).containsKey(k.toString())) {
            final StringBuilder i = a.k(s);
            i.append(this.mBaseKey);
            return bundle.getChar(i.toString());
        }
        return null;
    }
    
    public Double getBoxedDouble(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        if (((BaseBundle)bundle).containsKey(k.toString())) {
            final StringBuilder i = a.k(s);
            i.append(this.mBaseKey);
            return ((BaseBundle)bundle).getDouble(i.toString());
        }
        return null;
    }
    
    public Float getBoxedFloat(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        if (((BaseBundle)bundle).containsKey(k.toString())) {
            final StringBuilder i = a.k(s);
            i.append(this.mBaseKey);
            return bundle.getFloat(i.toString());
        }
        return null;
    }
    
    public Integer getBoxedInt(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        if (((BaseBundle)bundle).containsKey(k.toString())) {
            final StringBuilder i = a.k(s);
            i.append(this.mBaseKey);
            return ((BaseBundle)bundle).getInt(i.toString());
        }
        return null;
    }
    
    public Long getBoxedLong(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        if (((BaseBundle)bundle).containsKey(k.toString())) {
            final StringBuilder i = a.k(s);
            i.append(this.mBaseKey);
            return ((BaseBundle)bundle).getLong(i.toString());
        }
        return null;
    }
    
    public Short getBoxedShort(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        if (((BaseBundle)bundle).containsKey(k.toString())) {
            final StringBuilder i = a.k(s);
            i.append(this.mBaseKey);
            return bundle.getShort(i.toString());
        }
        return null;
    }
    
    public Bundle getBundle(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getBundle(k.toString());
    }
    
    public byte getByte(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getByte(k.toString());
    }
    
    public byte[] getByteArray(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getByteArray(k.toString());
    }
    
    public char getChar(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getChar(k.toString());
    }
    
    public char[] getCharArray(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getCharArray(k.toString());
    }
    
    public CharSequence getCharSequence(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getCharSequence(k.toString());
    }
    
    public CharSequence[] getCharSequenceArray(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getCharSequenceArray(k.toString());
    }
    
    public ArrayList<CharSequence> getCharSequenceArrayList(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getCharSequenceArrayList(k.toString());
    }
    
    public double getDouble(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return ((BaseBundle)bundle).getDouble(k.toString());
    }
    
    public double[] getDoubleArray(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return ((BaseBundle)bundle).getDoubleArray(k.toString());
    }
    
    public float getFloat(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getFloat(k.toString());
    }
    
    public float[] getFloatArray(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getFloatArray(k.toString());
    }
    
    public int getInt(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return ((BaseBundle)bundle).getInt(k.toString());
    }
    
    public int[] getIntArray(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return ((BaseBundle)bundle).getIntArray(k.toString());
    }
    
    public ArrayList<Integer> getIntegerArrayList(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getIntegerArrayList(k.toString());
    }
    
    public long getLong(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return ((BaseBundle)bundle).getLong(k.toString());
    }
    
    public long[] getLongArray(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return ((BaseBundle)bundle).getLongArray(k.toString());
    }
    
    public <T extends Parcelable> T getParcelable(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return (T)bundle.getParcelable(k.toString());
    }
    
    public Parcelable[] getParcelableArray(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getParcelableArray(k.toString());
    }
    
    public <T extends Parcelable> ArrayList<T> getParcelableArrayList(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getParcelableArrayList(k.toString());
    }
    
    public Parcelable getParent(final Bundle bundle) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.mBaseKey);
        sb.append("$$SUPER");
        return bundle.getParcelable(sb.toString());
    }
    
    public <T extends Serializable> T getSerializable(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return (T)bundle.getSerializable(k.toString());
    }
    
    public short getShort(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getShort(k.toString());
    }
    
    public short[] getShortArray(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getShortArray(k.toString());
    }
    
    public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return (SparseArray<T>)bundle.getSparseParcelableArray(k.toString());
    }
    
    public String getString(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return ((BaseBundle)bundle).getString(k.toString());
    }
    
    public String[] getStringArray(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return ((BaseBundle)bundle).getStringArray(k.toString());
    }
    
    public ArrayList<String> getStringArrayList(final Bundle bundle, final String s) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return bundle.getStringArrayList(k.toString());
    }
    
    public <T> T getWithBundler(final Bundle bundle, final String s) {
        final Bundler bundler = this.mBundlers.get(s);
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        return (T)bundler.get(k.toString(), bundle);
    }
    
    public void putBoolean(final Bundle bundle, final String s, final boolean b) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        ((BaseBundle)bundle).putBoolean(k.toString(), b);
    }
    
    public void putBooleanArray(final Bundle bundle, final String s, final boolean[] array) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        ((BaseBundle)bundle).putBooleanArray(k.toString(), array);
    }
    
    public void putBoxedBoolean(final Bundle bundle, final String s, final Boolean b) {
        if (b != null) {
            final StringBuilder k = a.k(s);
            k.append(this.mBaseKey);
            ((BaseBundle)bundle).putBoolean(k.toString(), (boolean)b);
        }
    }
    
    public void putBoxedByte(final Bundle bundle, final String s, final Byte b) {
        if (b != null) {
            final StringBuilder k = a.k(s);
            k.append(this.mBaseKey);
            bundle.putByte(k.toString(), (byte)b);
        }
    }
    
    public void putBoxedChar(final Bundle bundle, final String s, final Character c) {
        if (c != null) {
            final StringBuilder k = a.k(s);
            k.append(this.mBaseKey);
            bundle.putChar(k.toString(), (char)c);
        }
    }
    
    public void putBoxedDouble(final Bundle bundle, final String s, final Double n) {
        if (n != null) {
            final StringBuilder k = a.k(s);
            k.append(this.mBaseKey);
            ((BaseBundle)bundle).putDouble(k.toString(), (double)n);
        }
    }
    
    public void putBoxedFloat(final Bundle bundle, final String s, final Float n) {
        if (n != null) {
            final StringBuilder k = a.k(s);
            k.append(this.mBaseKey);
            bundle.putFloat(k.toString(), (float)n);
        }
    }
    
    public void putBoxedInt(final Bundle bundle, final String s, final Integer n) {
        if (n != null) {
            final StringBuilder k = a.k(s);
            k.append(this.mBaseKey);
            ((BaseBundle)bundle).putInt(k.toString(), (int)n);
        }
    }
    
    public void putBoxedLong(final Bundle bundle, final String s, final Long n) {
        if (n != null) {
            final StringBuilder k = a.k(s);
            k.append(this.mBaseKey);
            ((BaseBundle)bundle).putLong(k.toString(), (long)n);
        }
    }
    
    public void putBoxedShort(final Bundle bundle, final String s, final Short n) {
        if (n != null) {
            final StringBuilder k = a.k(s);
            k.append(this.mBaseKey);
            bundle.putShort(k.toString(), (short)n);
        }
    }
    
    public void putBundle(final Bundle bundle, final String s, final Bundle bundle2) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putBundle(k.toString(), bundle2);
    }
    
    public void putByte(final Bundle bundle, final String s, final byte b) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putByte(k.toString(), b);
    }
    
    public void putByteArray(final Bundle bundle, final String s, final byte[] array) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putByteArray(k.toString(), array);
    }
    
    public void putChar(final Bundle bundle, final String s, final char c) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putChar(k.toString(), c);
    }
    
    public void putCharArray(final Bundle bundle, final String s, final char[] array) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putCharArray(k.toString(), array);
    }
    
    public void putCharSequence(final Bundle bundle, final String s, final CharSequence charSequence) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putCharSequence(k.toString(), charSequence);
    }
    
    public void putCharSequenceArray(final Bundle bundle, final String s, final CharSequence[] array) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putCharSequenceArray(k.toString(), array);
    }
    
    public void putCharSequenceArrayList(final Bundle bundle, final String s, final ArrayList<CharSequence> list) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putCharSequenceArrayList(k.toString(), (ArrayList)list);
    }
    
    public void putDouble(final Bundle bundle, final String s, final double n) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        ((BaseBundle)bundle).putDouble(k.toString(), n);
    }
    
    public void putDoubleArray(final Bundle bundle, final String s, final double[] array) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        ((BaseBundle)bundle).putDoubleArray(k.toString(), array);
    }
    
    public void putFloat(final Bundle bundle, final String s, final float n) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putFloat(k.toString(), n);
    }
    
    public void putFloatArray(final Bundle bundle, final String s, final float[] array) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putFloatArray(k.toString(), array);
    }
    
    public void putInt(final Bundle bundle, final String s, final int n) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        ((BaseBundle)bundle).putInt(k.toString(), n);
    }
    
    public void putIntArray(final Bundle bundle, final String s, final int[] array) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        ((BaseBundle)bundle).putIntArray(k.toString(), array);
    }
    
    public void putIntegerArrayList(final Bundle bundle, final String s, final ArrayList<Integer> list) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putIntegerArrayList(k.toString(), (ArrayList)list);
    }
    
    public void putLong(final Bundle bundle, final String s, final long n) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        ((BaseBundle)bundle).putLong(k.toString(), n);
    }
    
    public void putLongArray(final Bundle bundle, final String s, final long[] array) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        ((BaseBundle)bundle).putLongArray(k.toString(), array);
    }
    
    public void putParcelable(final Bundle bundle, final String s, final Parcelable parcelable) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putParcelable(k.toString(), parcelable);
    }
    
    public void putParcelableArray(final Bundle bundle, final String s, final Parcelable[] array) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putParcelableArray(k.toString(), array);
    }
    
    public void putParcelableArrayList(final Bundle bundle, final String s, final ArrayList<? extends Parcelable> list) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putParcelableArrayList(k.toString(), (ArrayList)list);
    }
    
    public Bundle putParent(final Parcelable parcelable) {
        final Bundle bundle = new Bundle();
        if (parcelable != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.mBaseKey);
            sb.append("$$SUPER");
            bundle.putParcelable(sb.toString(), parcelable);
        }
        return bundle;
    }
    
    public void putSerializable(final Bundle bundle, final String s, final Serializable s2) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putSerializable(k.toString(), s2);
    }
    
    public void putShort(final Bundle bundle, final String s, final short n) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putShort(k.toString(), n);
    }
    
    public void putShortArray(final Bundle bundle, final String s, final short[] array) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putShortArray(k.toString(), array);
    }
    
    public void putSparseParcelableArray(final Bundle bundle, final String s, final SparseArray<? extends Parcelable> sparseArray) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putSparseParcelableArray(k.toString(), (SparseArray)sparseArray);
    }
    
    public void putString(final Bundle bundle, final String s, final String s2) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        ((BaseBundle)bundle).putString(k.toString(), s2);
    }
    
    public void putStringArray(final Bundle bundle, final String s, final String[] array) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        ((BaseBundle)bundle).putStringArray(k.toString(), array);
    }
    
    public void putStringArrayList(final Bundle bundle, final String s, final ArrayList<String> list) {
        final StringBuilder k = a.k(s);
        k.append(this.mBaseKey);
        bundle.putStringArrayList(k.toString(), (ArrayList)list);
    }
    
    public <T> void putWithBundler(final Bundle bundle, final String s, final T t) {
        if (t != null) {
            final Bundler bundler = this.mBundlers.get(s);
            final StringBuilder k = a.k(s);
            k.append(this.mBaseKey);
            bundler.put(k.toString(), t, bundle);
        }
    }
}
