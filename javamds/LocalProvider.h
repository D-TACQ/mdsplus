/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class LocalProvider */

#ifndef _Included_LocalProvider
#define _Included_LocalProvider
#ifdef __cplusplus
extern "C" {
#endif
#undef LocalProvider_TIME_OUT
#define LocalProvider_TIME_OUT 10000LL
/*
 * Class:     LocalProvider
 * Method:    ErrorString
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_LocalProvider_ErrorString
  (JNIEnv *, jobject);

/*
 * Class:     LocalProvider
 * Method:    GetByteArray
 * Signature: (Ljava/lang/String;)[B
 */
JNIEXPORT jbyteArray JNICALL Java_LocalProvider_GetByteArray
  (JNIEnv *, jobject, jstring);

/*
 * Class:     LocalProvider
 * Method:    GetFloat
 * Signature: (Ljava/lang/String;)F
 */
JNIEXPORT jfloat JNICALL Java_LocalProvider_GetFloat
  (JNIEnv *, jobject, jstring);

/*
 * Class:     LocalProvider
 * Method:    GetFloatArray
 * Signature: (Ljava/lang/String;)[F
 */
JNIEXPORT jfloatArray JNICALL Java_LocalProvider_GetFloatArray
  (JNIEnv *, jobject, jstring);

/*
 * Class:     LocalProvider
 * Method:    GetIntArray
 * Signature: (Ljava/lang/String;)[I
 */
JNIEXPORT jintArray JNICALL Java_LocalProvider_GetIntArray
  (JNIEnv *, jobject, jstring);

/*
 * Class:     LocalProvider
 * Method:    GetString
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_LocalProvider_GetString
  (JNIEnv *, jobject, jstring);

/*
 * Class:     LocalProvider
 * Method:    SetEnvironment
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_LocalProvider_SetEnvironment
  (JNIEnv *, jobject, jstring);

/*
 * Class:     LocalProvider
 * Method:    Update
 * Signature: (Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_LocalProvider_Update
  (JNIEnv *, jobject, jstring, jint);

#ifdef __cplusplus
}
#endif
#endif
