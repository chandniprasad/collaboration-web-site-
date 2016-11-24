'use strict';

app.controller("FriendController", ['UserService','$scope','FriendService','$location','$rootScope',   
                                    function($UserService,$scope,FriendService,$location,$rootScope){
	console.log("FriendController...")
  	var self = this;
	self.user ={
			id : '',
			name :'',
			email : '',
			password : '',
			mob_no : '',
			dob : '',
			gender : '',
			role : '',
			errorMessage : '',
			errorCode : ''
	};
	self.users = [];
	
	self.send FriendRequest=sendFriendRequest
	function sendFriendRequest(friend_id)
	{
		console.log("->sendFriendRequest :"+friend_id)
		FriendService.sendFriendRequest(friend_id)
		.then
		(function(d){
			self.friend = d;
			alert("Friend request sent")
		},
		  function(errResponse){
			console.error('Error while sending friend request');
		}
		);
	}
	
	self.getMyFriends = function(){
		console.log("Getting my friends")
		FriendsService.getMyFriends()
		.then(
		     function()	{
		    	 self.friend = d;
					alert("Got the friend request")
		     },
		     function(errResponse){
					console.error('Error while sending friend request');
				}
		);
	};
	
	self.updateFriendRequest = function(friend, id){
		Friendservice.updateFriendRequest(friend, id)
		.then(
				self.fetchAllFriends,
			     function(errResponse){
						console.error('Error while updating friend');
					} 		
		);
	};
	
	self.deleteFriend = function(id){
		Friendservice.deleteFriend(id)
		.then(
				self.fetchAllFriends,
			     function(errResponse){
						console.error('Error while deleting friend');
					} 		
		);
	};
	
	self.fetechAllUsers = function(id){
		UserService.fetchAllusers().then(function(d){
			self.user = d;
		},
			     function(errResponse){
						console.error('Error while feteching users');
					} 		
		);
	};
	
	self.fetchAllUsers();
	self.getMyFriends();
	
}])
  

	
	