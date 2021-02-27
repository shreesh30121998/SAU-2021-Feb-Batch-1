import React from 'react';
import { Text, TouchableOpacity, StyleSheet } from 'react-native';

function Comp({title}) {
    return (
        <TouchableOpacity style={styles.button}>
            <Text style={styles.txt}>{title}</Text>
        </TouchableOpacity>
    );
}


const styles = StyleSheet.create({
    button:{
        backgroundColor:'#43bfb9',
        justifyContent:'center',
        alignItems:'center',
        alignSelf:"center",
        width:'60%',
        marginVertical:10,
        opacity:0.8,
        elevation:50,
        padding:15
        
    },
    txt:{
        color: '#2e2929',
        fontSize:16,
        textTransform:'uppercase',
        fontWeight:'bold'
    }
})

export default Comp;