import React from 'react';
import { Text, StyleSheet } from 'react-native';

function WelcomeComp({title}) {
    return (
        <Text style={styles.button}>
            <Text style={styles.txt}>{title}</Text>
        </Text>
    );
}


const styles = StyleSheet.create({
    button:{
        justifyContent:'center',
        alignItems:'center',
        width:'100%',
        marginVertical:10,
        opacity:1,
        elevation:50,
        padding:15,
        alignSelf:"center"
    },
    txt:{
        color: '#000000',
        fontSize:16,
        alignSelf:'center',
        textTransform:'uppercase',
        fontWeight:'bold'
    }
})

export default WelcomeComp;