package org.roaringbitmap;

public interface ObjectSizer {

    long getObjectHeaderSize();

    long getArrayHeaderSize();

    long getObjectPointerSize();

    long getPaddedSize(long unpaddedSize);

    default long getArraySize(short[] array) {
        return getPaddedSize(getArrayHeaderSize() + array.length * 2);
    }
    default long getArraySize(long[] array) {
        return getPaddedSize(getArrayHeaderSize() + array.length * 8);

    }
    default long getArraySize(Object[] array) {
        return getPaddedSize(getArrayHeaderSize() + array.length * getObjectPointerSize());
    }

}



