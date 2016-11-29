app.controller("ChatForumController" ,  function($scope,$rootscope, ChatForumService) {
	console.log('ChatForumController')
	$scope.messages = [];
    $scope.message =  {msg:'',name:''}
    $scope.max = 50;
    
    $scope.name.userID=$rootScope.currentUser.name
    
    $scope.addMessage = function() {
    	console.log("addMessage")
    ChatForumService.send($scope.message);
    	$scope.message.msg = "";
    };
    
    ChatForumService.recieve().then(null , null, function(message) {
         console.log("recieve") 
         
       $scope.messages.push(message);  
    });
}); 