$(document).ready(function() {


        console.log("jquery works");

        $(".approve").on("click", function(){
            console.log("approve clicks");
            var contextRoot = "/" + window.location.pathname.split('/')[1];

            var userID = $(this).data("userid");
            // var userID = 1;
            console.log("contextRoot", contextRoot);
            console.log("userID", userID);

            $.ajax({
                url: contextRoot + "/rest/updateUser/" + userID,
                type: 'GET',
                dataType: "json",
                success: function (response) {
                   // alert("Product Successfully added to the Cart!");
                    $("card-"+userID).slideUp();

                },
                error: function () {
                    // alert('Error while request..');
                    $(".card-"+userID).slideUp();
                }
            });
        })

});

