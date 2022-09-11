package com.example.oregonmicrobreweries.data.local

data class Brewery(
    val id: Int,
    val title: String,
    val description: String,
    var isFavorite: Boolean = false
)

val dummyBreweries = listOf(
    Brewery(
        1,
        "Alesong Brewing & Testing Room",
        "We approach brewing like a musician composing a song\n" +
            "Each beer begins with an inspiration: from nature, food, or an unforgettable experience"),
    Brewery(
        2,
        "Arch Rock Brewing Company",
        "We are a production brewery with a tiny tasting room" +
            " where you can sample our South Coast Style beer"),
    Brewery(
        3,
        "Ascendant Beer Company",
        "Our award-winning team of brewers is dedicated to producing " +
                "small batch and exciting new beer styles for the local market.  " ),
    Brewery(
        4,
        "Barley Brown's Brewing Co",
        "You know you’re in Oregon when you see Pallet Jack IPA"),
    Brewery(
        5,
        "Barrett Beverage",
        "You take your product seriously, and so do we. As a dedicated contract production facility, " +
                "we’re committed to doing it the right way. This means an emphasis on quality, " +
                "consistency and customer service."),
    Brewery(
        6,
        "Beaver State Brewing",
        "We are a small, independently owned craft brewery located in beautiful Bend, Oregon. " +
                "While working with a very old craft, we are spinning up something new and continuing " +
                "to subscribe to modern day definitions regarding brewing parameters and guidelines. " +
                "Even though creativity is our goal, "),
    Brewery(
        7,
        "Beer Valley Brewing Co",
        "Founded in 2005 by brewer Pete Ricks, the brewery started production in Ontario, " +
                "Oregon in the summer of 2007. Specializing in the production of strong ales, " +
                "the brewery currently produces 6 brands year round, plus occasional seasonal. "),
    Brewery(
        8,
        "Bend Brewing High Desert",
        "Brewed with 50% wheat malt from Mecca Grade Estate Malt, " +
                "this heritage style unfiltered American wheat ale is lightly hopped and " +
                "features a medium body and a pleasant doughy malt character."),
    Brewery(
        9,
        "Bent Shovel Brewing",
        "Public house and beer garden"),
    Brewery(
        10,
        "Block 15 Brewing Company",
        "Offering unique hop-forward ales, crisp lagers, " +
                "barrel-aged rarities and one of the Northwest’s most extensive wild & sour programs, " +
                "Block 15 produces a range of artfully crafted beers, " +
                "brewed with a nod toward fresh ingredients and fresh thinking."),
    Brewery(
        11,
        "Boneyard Beer Co",
        "In July 2018, we opened our doors to Boneyard Pub. " +
                "Not only can you now enjoy a full pint straight from the source, the food is delicious!\n" +
                "To date, we have expanded our production by adding a canning line. " +
                "As of March 2020 Boneyard Beer is available in 12oz, 6-pack CANS, distributed throughout Oregon!"),
    Brewery(
        12,
        "Brewery 26",
        "We started as a nano brewery in a 2-car garage back in 2017. " +
                "We are now in our new space with a 7 barrel brew system and a taproom open to the public. " +
                "We like to keep a wide variety of beers on hand and are continually offering new creations for your hoppy needs. " +
                "Stop by to try them for yourself. Cheers!"),
    Brewery(
        13,
        "Bridge 99 Brewery",
        "Bridge 99 Brewery is a small batch brewery that has been growing since 2013, " +
                "from 2BBL batches to a brand new 15BBL system which pushed us into a new Tap Room in 2018, " +
                "we have tried our best to grow in a sustainable manner."),
    Brewery(
        14,
        "Caldera Brewing Company",
        "Caldera Brewing Company, located in Ashland, Oregon, " +
                "is dedicated to producing uncompromised quality " +
                "ales, lagers, seltzers, sodas and cuisine."),
    Brewery(
        15,
        "Cascade Brewing Barrel House",
        "Cascade Brewing has been a pioneer in the sour beer renaissance since 2006 and " +
                "is the proud innovator of the Northwest Sour Ale. "),
    Brewery(
        16,
        "Cascade Brewing Barrel House",
        "Cascade Brewing has been a pioneer in the sour beer renaissance since 2006 and  " +
                "is the proud innovator of the Northwest Sour Ale."),
    Brewery(
        17,
        "Cascade Brewing Blending House",
        "Cascade Brewing has been a pioneer in the sour beer renaissance since 2006 " +
                "and is the proud innovator of the Northwest Sour Ale. " ),
    Brewery(
        18,
        "Cascade Brewing Blending House",
        "Cascade Brewing has been a pioneer in the sour beer renaissance since 2006 " +
                "and is the proud innovator of the Northwest Sour Ale. "),
    Brewery(
        19,
        "Cascade Lakes Brewing Co",
        "We are based in Central Oregon and feature high quality craft beers at our Bend and Redmond brewpubs!"),
    Brewery(
        20,
        "Coldfire Brewing",
        "We honor the traditional craft founded by European Brewers while being proudly rooted in the Great Northwest."),
    Brewery(
        21,
        "Compass Brewing PDX",
        "No information yet"),
    Brewery(
        22,
        "Crooked Creek Brewery",
        "Crooked Creek Brewery is a nano-brewery in rural Columbia County, Oregon, " +
                "just 25 miles north of Portland on the way to the Oregon Coast. "),
    Brewery(
        23,
        "Crux Fermentation Project - Crux2",
        "no information at this time"),
    Brewery(
        24,
        "Culmination Brewing Co",
        "We are an award winning microbrewery from Portland, OR. Making unconventional, " +
                "modern and traditional beers. "),
    Brewery(
        25,
        "De Garde Brewing",
        "no information at this time."),
    Brewery(
        26,
        "Draper Brewing",
        "no information at this time."),
    Brewery(
        27,
        "Duality Brewing Co.",
        "no information at this time."),
    Brewery(
        28,
        "Evasion Brewing - Production Facility",
        "If it doesn't taste good, nothing else matters."),
    Brewery(
        29,
        "Ex Novo Brewing Co",
        "no information at this time."),
    Brewery(
        30,
        "ForeLand Beer",
        "ForeLand Beer is dedicated to the art and craft of brewing. " +
                "We find beauty and draw inspiration from the diverse natural world around us and" +
                " hope that we can translate that into the beer we make."),
    Brewery(
        31,
        "Fort George Brewery Waterfront",
        "no information at this time."),
    Brewery(
        32,
        "Fracture Brewing",
        "no information at this time."),
    Brewery(
        33,
        "Freehand Brewery",
        "no information at this time."),
    Brewery(
        34,
        "Funhouse Brews",
        "A North Portland home-based Nanobrewery, Funhouse operates a 2 bbl. " +
                "system and self-distributing 1/4 and 1/6 barrels. " ),
    Brewery(
        35,
        "G Man Brewery / G-Man Sports Bar",
        "no information at this time."),
    Brewery(
        36,
        "Gateway Brewing, Inc",
        "Brewed in small batches and hand-delivered to bars and restaurants across Oregon, " +
                "Gateway beer celebrates the sights and sounds of East Portland."),
    Brewery(
        37,
        "Gigantic Brewing Co",
        "Gigantic is complying with all current state guidelines regarding Covid.  " +
                "At this moment, that means masks are option for both staff and customers.  "),
    Brewery(
        38,
        "Gilgamesh Brewing Co",
        "After years of home-brewing, the Radtke brothers, " +
                "Mike, Nick, Matt and their father Lee, " +
                "decided to turn their shared hobby into a family business. "),
    Brewery(
        39,
        "Golden Valley Brewery and Pub",
        "no information yet"),
    Brewery(
        40,
        "GoodLife Brewing Company",
        "no information yet"),
    Brewery(
        41,
        "Great Notion Brewing NW",
        "no information yet"),
    Brewery(
        42,
        "Ground Breaker Brewing",
        "A Dedicated Gluten-Free Brewery & Gastropub.\n" +
                "Making 100% Gluten-Free Beer & Food"),
    Brewery(
        43,
        "Heater Allen Brewery",
        "no information yet"),
    Brewery(
        44,
        "Hopworks Urban Brewery",
        "We create exceptional beer and food with sustainable business practices " +
                "that protect our planet and support our community."),
    Brewery(
        45,
        "Integrity Brewing Company",
        "no information yet"),
    Brewery(
        46,
        "Kings & Daughters Brewery",
        "We are focused on how we can enrich your life — " +
                "it just so happens that we are doing this primarily through the primary lens of craft beer. "),
    Brewery(
        47,
        "Labyrinth Forge Brewing Company",
        "Explorer, all great civilizations have had their labyrinths. " ),
    Brewery(
        48,
        "Leikam Brewing",
        "With most ingredients coming from an hour or less away and a hands-on approach, " +
                "we’re committed to highlighting the beauty of the Pacific Northwest. "),
    Brewery(
        49,
        "Little Beast Brewing",
        "Little Beast Brewing is our family owned, " +
                "small-batch brewery that was founded in 2017 with a passion for innovation, " +
                "an appreciation for uniqueness, and an obsession with quality. "),
    Brewery(
        50,
        "Little Hop Brewing",
        "The term Little Hop is meant to indicate that sometimes less is more, quality over quantity.  " +
                "Beer in its simplest form."),
    Brewery(
        51,
        "Logsdon Farmhouse Ales",
        "We are now open in our new Portland location! (currently for to-go beer sales only)\n" +
                "\n" +
                "Come visit us Thursday, Friday, or Saturday between 2 and 7pm\n" +
                "at 2425 SE 35th Pl (just off of Division St.)"),
    Brewery(
        52,
        "Long Brewing LLC",
        "Ales and Lagers handcrafted without compromise. " +
                "Our layered approach to brewing results in expressive aromas " +
                "and flavors that are integrated and balanced. "),
    Brewery(
        53,
        "Manifest Beer Company",
        "no information yet"),
    Brewery(
        54,
        "Mazama Brewing Co",
        "Mazama Brewing Co. is an independent, " +
                "family owned and operated craft brewery in Corvallis, Oregon. "),
    Brewery(
        55,
        "McMenamins Edgefield Brewery",
        "Great benefits & perks. Short & long-term opportunities."),
    Brewery(
        56,
        "McMenamins Fulton Pub and Brewery",
        "Great benefits & perks. Short & long-term opportunities."),
    Brewery(
        57,
        "McMenamins Hillsdale Brewery and Public House",
        "Great benefits & perks. Short & long-term opportunities."),
    Brewery(
        58,
        "McMenamins Oak Hills Brewery",
        "Great benefits & perks. Short & long-term opportunities."),
    Brewery(
        59,
        "McMenamins Roseburg Station Brewery",
        "Great benefits & perks. Short & long-term opportunities."),
    Brewery(
        60,
        "McMenamins Thompson Brewery",
        "Great benefits & perks. Short & long-term opportunities."),
    Brewery(
        61,
        "McMenamins West Linn Brewery",
        "Great benefits & perks. Short & long-term opportunities."),
    Brewery(
        62,
        "Migration Brewing Co",
        "On a sunny day in the Fall of 2008, " +
                "we found ourselves sharing beers and engrossed in a conversation that began " +
                "about starting a business but quickly delved into personal values and visions of the future."),
    Brewery(
        63,
        "Migration Brewing Co",
        "no information at this time"),
    Brewery(
        64,
        "Moonshrimp Brewing",
        "Locally made, sustainably and responsibly produced, " +
                "small batch fermented and hand bottled."),
    Brewery(
        65,
        "Mountain View Brewing",
        "no information yet"),
    Brewery(
        66,
        "Mt. Hood Brewing Co.",
        "3 locations"),
    Brewery(
        67,
        "Nebuleus Beer",
        "no information available"),
    Brewery(
        68,
        "New Spring Beer",
        "no information yet"),

    Brewery(
        69,
        "Oakshire Brewing",
        "Oakshire is a community-inspired, small-batch brewing company founded in 2006. "),
    Brewery(
        70,
        "Oblivion Brewing Co",
        "no information yet"),
    Brewery(
        71,
        "Occidental Brewing",
        "Our Taproom has reopened with expanded outdoor seating!" +
                "Masks are required (properly worn over nose and mouth). We hope to see you soon!"),
    Brewery(
        72,
        "Old Town Brewing",
        "Historic ties to Portland run deep within Old Town. " +
                "Opening its doors as a family-run pizzeria in April of 1974, " +
                "Old Town Pizza became a hub for like-minded people with a radical agenda. "),
    Brewery(
        73,
        "Ordnance Brewing",
        "The title photo above is Gene Davidson's hop operation.  " +
                "His mother, Anna Coleman, married Frank Davidson.  " ),
    Brewery(
        74,
        "PFriem Cascade Locks Barrelhouse",
        "no information yet"),
    Brewery(
        75,
        "Parallel 45 Brewing",
        "no information yet"),
    Brewery(
        76,
        "Pelican Brewing Company - Tillamook",
        "no information yet"),
    Brewery(
        77,
        "Pono Brew Labs",
        "no information yet"),
    Brewery(
        78,
        "Pono Brewing Company",
        "Pono Brewing is a craft brewery located in Portland, " +
                "Oregon with roots from the Pacific Islands. "),
    Brewery(
        79,
        "Public Coast Brewing Co.",
        "no information yet"),
    Brewery(
        80,
        "Reach Break Brewing",
        "Your local brewery experience"),
    Brewery(
        81,
        "RiverBend Brewing Company",
        "no information yet"),
    Brewery(
        82,
        "Rogue East Side Pub & Pilot Brewery",
        "no information yet"),
    Brewery(
        83,
        "Shade Tree Brewing",
        "Located in The Deschutes River Woods\n" +
                "Serving Southern Bend and Beyond"),
    Brewery(
        84,
        "Shattered Oak Brewing",
        "no information yet"),
    Brewery(
        85,
        "Silver Moon Brewing",
        "Our tried & true. The ones you love: Offered all year long in 6-pack cans and on draft!"),
    Brewery(
        86,
        "Silver Moon Brewing",
        "Our tried & true. The ones you love: Offered all year long in 6-pack cans and on draft!"),
    Brewery(
        87,
        "Skyline Brewing Company",
        "Skyline Brewing Company is built on passion. " +
                "We are very passionate about our families, our rural way of life, our community, " +
                "and especially about great beer! "),
    Brewery(
        88,
        "Solvana Brewing",
        "no information yet"),
    Brewery(
        89,
        "Sunriver Brewing",
        "Sunriver Brewing Company is a locally owned business committed to providing " +
                "the highest quality craft products and best in class service since Independence Day, 2012. "),
    Brewery(
        90,
        "Terminal Gravity Brewing Co",
        "We love to make a variety of full-flavored beers."),
    Brewery(
        91,
        "The Ale Apothecary",
        "Bend’s only sour brewery, The Ale Apothecary, creates totally natural, " +
                "barrel-aged beer using ingredients off our land or sourced nearby, direct from Oregon farms.  "),
    Brewery(
        92,
        "Three Creeks Brewing Co",
        "We’ve never been one to follow trends, but to tenaciously blaze our own trail. "),
    Brewery(
        93,
        "Upright Brewing Co",
        "Upright references the primary instrument of Charles Mingus, " +
                "the great musician whose compositions defied categorization."),
    Brewery(
        94,
        "Van Henion Brewing",
        "no information yet"),
    Brewery(
        95,
        "Vision Brewing Company",
        "no information yet"),
    Brewery(
        96,
        "Walkabout Brewing Co",
        "no information yet"),
    Brewery(
        97,
        "War & Leisure Brewing",
        "no information yet"),
    Brewery(
        98,
        "Wayfinder Beer",
        "Wayfinder Beer, based in Portland Oregon, " +
                "is a lager-centric brewery that combines old and new school lager techniques " +
                "to push the envelope of what lager can be. "),
    Brewery(
        99,
        "Wolf Tree Brewery",
        "Located on a cattle ranch along the Oregon coast, " +
                "Wolf Tree Brewery strives to produce ales that encompass the spirit of the ranch " +
                "and our surrounding coastal forests. "),
    Brewery(
        100,
        "Worthy Brewing Co.",
        "no information yet")
)





