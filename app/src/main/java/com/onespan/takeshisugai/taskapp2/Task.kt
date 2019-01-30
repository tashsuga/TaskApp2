package com.onespan.takeshisugai.taskapp2

//package jp.techacademy.taro.kirameki.taskapp

import android.os.Parcel
import android.os.Parcelable
import io.realm.Realm
import io.realm.RealmMigration
import java.io.Serializable
import java.util.Date
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/*
private open class Task(var realmObject: this,// Realm全体の初期化
                        val realm: Realm? = Realm.getInstance()
) : RealmObject(), Serializable, Parcelable {
    var title: String = ""      // タイトル
    var contents: String = ""   // 内容
    var date: Date = Date()     // 日時
*/


open class Task : RealmObject(), Serializable {

    var title: String = ""      // タイトル
    var contents: String = ""   // 内容
    var date: Date = Date()     // 日時
    var category: String = ""      // カテゴリ

    // id をプライマリーキーとして設定
    @PrimaryKey
    var id: Int = 0


    /*
    // categoryというStringプロパティ

   var category: String
       get() = ""
       set(value) = TODO()

    // id をプライマリーキーとして設定
    @PrimaryKey
    var id: Int = 0
*/

    /*
    constructor(parcel: Parcel) : this(
        TODO("realmObject"),
        TODO("realm")
    ) {
        title = parcel.readString()
        contents = parcel.readString()
        category = parcel.readString()
        id = parcel.readInt()
    }
*/

// このスレッドのためのRealmインスタンスを取得
   // Realm realm = Realm.getDefaultInstance();

// 年齢が2未満のすべてのDogオブジェクトを取得する問い合わせを発行
    //final RealmResults<Dog> puppies = realm.where(Dog.class).lessThan("age", 2).findAll();
    //puppies.size(); // => まだRealmへは一つもオブジェクトが保存されていないので0を返します

  /*
    final Dog managedDog = realm.copyToRealm(dog); // unmanagedなオブジェクトを永続化
    Person person = realm.createObject(Person.class); // managedなオブジェクトを直接作成
    person.getDogs().add(managedDog);
    realm.commitTransaction();
    */

    /*
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(contents)
        parcel.writeString(category)
        parcel.writeInt(id)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Task> {
        override fun createFromParcel(parcel: Parcel): Task {
            return Task(parcel)
        }

        override fun newArray(size: Int): Array<Task?> {
            return arrayOfNulls(size)
        }
    }
*/


}
