app

import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  Image,
  TouchableOpacity,
  TouchableHighlight,
  ScrollView,
  Animated,
  ActivityIndicator,
  Alert
} from 'react-native';
import { StackNavigator } from 'react-navigation';

class HomeScreen extends React.Component {
  state = {
    jobData: [],
    loading: false,
    scrollY: new Animated.Value(0)
  };

 componentDidMount(){ 
    this.setState({ loading: true });
    fetch('http://example.url/api/jobs')
      .then((response) => response.json())
      .then((responseJson) => {
        this.setState({ jobData: responseJson, loading: false });
      })
      .catch((error) => {
        console.error(error);
        this.setState({ loading: false });
      });
  }

render(){
  const headerTransform = this.state.scrollY.interpolate({
      inputRange: [0, 70],
      outputRange: [0, -70],
      extrapolate: 'clamp',
    });

 const buttonAddTransform = this.state.scrollY.interpolate({
      inputRange: [0, 70],
      outputRange: [70, 0],
      extrapolate: 'clamp',
    });

  return (
    <View style={styles.container}>
      <Animated.View style={[styles.header, { transform: [{ translateY: headerTransform }] }]}>
        <Image style={styles.logo}
          source={require('./bridges_logo.png')}
          resizeMode="center"
        />
        <Animated.View
          style={[styles.buttons, { transform: [{ translateY: buttonAddTransform }] }]}
        >
          <TouchableHighlight 
            style={styles.addJob} 
            onPress={() => this.props.navigation.navigate('AddJob')}
            underlayColor="rgba(175, 223, 170,.4)"
          >
            <Text style={styles.addJobText}>Add Job</Text>
          </TouchableHighlight>
        </Animated.View>
      </Animated.View>
      <ScrollView
        style={styles.scrollView}
        scrollEventThrottle={16}
        onScroll={Animated.event(
          [{ nativeEvent: { contentOffset: { y: this.state.scrollY } } }]
        )}
      >
        {this.state.loading ?
          <ActivityIndicator size="large" style={styles.spinner} />
        :
          this.state.jobData.map(job =>
            <Job key={job.id} job={job} />
          )}
      </ScrollView>
    </View>
  );
}
}

class Job extends React.Component {
  render(){
    const { job } = this.props;

    return(
      <View style={styles.jobContainer}>
        <View style={styles.jobData}>
          <Text style={styles.jobTitle}>{job.title}</Text>
          <Text style={styles.jobDescription}>
            {job.description.substring(0, 80)}...
          </Text>
        </View>
        <TouchableOpacity
          style={styles.applyButton}
          onPress={() => Alert.alert(
            'You tapped the button!',
            'Apply soon!'
          )}
        >
          <Text style={styles.applyText}>Apply</Text>
        </TouchableOpacity>
      </View>
    );
  }
}

class AddJobScreen extends React.Component {
  render(){
    return(
      <View style={styles.addJobContainer}>
        <Text style={styles.addJobFormTitle}>Add Job</Text>
        {/* Form fields and submit button */}
      </View>
    );
  }
}

const BridgesApp = StackNavigator({
  Home: { screen: HomeScreen },
  AddJob: { screen: AddJobScreen },
});

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  header: {
    backgroundColor: '#83C5BE',
    paddingTop: 40,
    paddingBottom: 20,
    position: 'absolute',
    top: 0,
    left: 0,
    right: 0,
    zIndex: 10
  },
  logo: {
    width: 120,
    height: 25,
    alignSelf: 'center',
  },
  buttons: {
    flexDirection: 'row',
    position: 'absolute',
    bottom: 15,
    right: 0,
    left: 0,
    zIndex: 10,
    justifyContent: 'center',
  },
  addJob: {
    backgroundColor: '#4CAA8A',
    padding: 10,
    borderRadius: 5,
    shadowColor: '#000000',
    shadowOpacity: 0.8,
    shadowRadius: 2,
    shadowOffset: {
      height: 1,
      width: 0
    },
    marginTop: 0
  },
  addJobText:{
    color: '#ffffff',
    fontSize: 18,
    textAlign: 'center',
  },
  scrollView: {
    paddingTop: 120
  },
  jobContainer: {
    borderColor: '#DFDFDF',
    borderWidth: 1,
    margin: 10,
    backgroundColor: '#FFF',
    padding: 10
  },
  jobData: {
    marginBottom: 10
  },
  jobTitle:{
    fontSize: 22,
    color: '#4CAA8A',
    fontWeight: 'bold'
  },
  jobDescription:{
    fontSize: 16,
    color: '#444'
  },
  applyButton:{
    backgroundColor: '#4CAA8A',
    padding: 10,
    borderRadius: 15,
    shadowColor: '#000000',
    shadowOpacity: 0.4,
    shadowRadius: 2,
    shadowOffset: {
      height: 1,
      width: 0
    },
    marginTop: 10
  },
  applyText:{
    color: '#ffffff',
    fontSize: 18,
    textAlign: 'center',
  },
  addJobContainer: {
    backgroundColor: '#FFF',
    padding: 20
  },
  addJobFormTitle: {
    fontSize: 22,
    color: '#4CAA8A',
    fontWeight: 'bold',
    textAlign: 'center'
  },
  spinner:{
    marginTop: 150
  }
});

AppRegistry.registerComponent('BridgesApp', () => BridgesApp);