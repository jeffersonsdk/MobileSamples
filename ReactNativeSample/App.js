/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, { Component } from 'react';
import {
  View,
  Text,
  NativeModules,
  TouchableOpacity
} from 'react-native';

const jeff = NativeModules.JeffersonSDK

export default class App extends Component {
  constructor(props){
    super(props);

  }

  componentDidMount(){
    jeff.start()
  //jeff.sendEvent("event_one");
  }

  render() {
    return (
      <View style={{alignContent:'center'}}>
        <Text>JEFFERSON SDK</Text>
        <TouchableOpacity style={{backgroundColor:'blue'}} onPress={()=>jeff.sendEvent("event_one")}>
          <Text>Send Event</Text>
        </TouchableOpacity>
      </View>
    );
  }
}


