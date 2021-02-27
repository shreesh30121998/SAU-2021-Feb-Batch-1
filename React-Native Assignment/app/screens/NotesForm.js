import React from 'react';
import { useState } from 'react';

import { Image, ImageBackground, StyleSheet, View, TextInput , Text, FlatList } from 'react-native';

import Comp from '../components/Comp'

function NotesForm(props) {

    const [todos,setTodos] = useState([
        {
            topic:"hello",
            description: "blah"
        }
    ]);

    return (
        <View style={styles.mainCont}>
            <View style={styles.itemCont}>
            <View style={styles.textCont}>
                <TextInput style={styles.textStyle} placeholder="Enter Note Title" placeholderTextColor="#fff" /></View>
            
            <View style={styles.textCont}>
                <TextInput style={styles.textStyle} placeholder="Enter Note Desciption" placeholderTextColor="#fff" />
            </View>
            <View style={styles.textCont}>
                <TextInput style={styles.textStyle} placeholder="Enter Category" placeholderTextColor="#fff" /></View>
            </View>
            <View style={styles.logButtons}>
                <Comp title="Add" />
            </View>

            
        </View>
    );
}
const styles = StyleSheet.create({
    
    mainCont:{
        marginBottom:10,
        borderRadius:20,
        width:'100%',
        backgroundColor:'#ffffff',
        opacity:0.5,
        color:'white',
        flex:1,
        justifyContent:'center'
    },
    textCont:{
        backgroundColor:'white',
        padding:20,
        marginBottom:20
    },
    textStyle:{
        fontSize:15,
        fontFamily:"Roboto",
        color:"white",  
      },
    logButtons:{
        padding:20,
        width:'100%',
        
    }  
      
})

export default NotesForm;