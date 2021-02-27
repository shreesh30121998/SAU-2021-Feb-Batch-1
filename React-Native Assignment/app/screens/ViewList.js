import React from 'react';
import { FlatList, StyleSheet, View, Text, SafeAreaView } from 'react-native';
import { mdiTrashCanOutline } from '@mdi/js';
import Icon from '@mdi/react';
import { mdiAccount } from '@mdi/js';

var now = new Date();
const today=now.getDate() + "/"+ parseInt(now.getMonth()+1) +"/"+ now.getFullYear();

const myNotes=[
    {
        id:1,
        heading: 'JavaScript Session',
        subheading:'Assignment Done',
        type:'Personal',
        dateAdded:today
    },
    {
        id:1,
        heading: 'ReactJS Session',
        subheading:'Assignment Done',
        type:'Personal',
        dateAdded:today
    },{
        id:1,
        heading: 'ReactNative Session',
        subheading:'Assignment Pending',
        type:'Personal',
        dateAdded:today
    },{
        id:1,
        heading: 'Maven Session',
        subheading:'Assignment Pending',
        type:'Personal',
        dateAdded:today
    },
];

function ViewList(props) {
    return (
        <SafeAreaView style={styles.cont}>
            <FlatList
            
            data={myNotes}
            keyExtractor={note=>note.id.toString()}
            renderItem={({item})=>
            <View style={styles.noteTxt}>
                <Text style={styles.heading}> {item.heading}</Text>
                <Text style={styles.subheading}>{item.subheading} - {item.type}</Text>
                <Text style={styles.date}>{item.dateAdded}</Text>
        </View>}
            
            />
        </SafeAreaView>
    );
}

const styles = StyleSheet.create({
    cont:{
        marginTop:30
    },
    noteTxt:{
        borderRadius:15,
        backgroundColor:'#ffffff',
        marginBottom:20,
        overflow:'hidden',
        padding:10,
        marginTop:10,
        alignItems:"center"
    },
    date:{
        color:'#02f051',
        marginVertical:5,
        fontWeight:'bold',
        alignSelf:"flex-end"
    },
    subheading:{
        color:'#02f051',
        fontWeight: 'bold'
    },
    heading:{
        alignItems:"center",
        color:'#02f051',
        marginBottom:8
    },
    addNote:{
        position:'absolute',
        bottom:10,
        right:0
    }


})

export default ViewList;